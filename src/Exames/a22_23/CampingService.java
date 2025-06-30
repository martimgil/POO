package Exames.a22_23;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CampingService implements CampingServiceInterface{
    private String nome;
    private String endereco;
    private ArrayList<CampingSpace> espacos;
    private HashSet<Client> clients;
    private HashMap<Client, ArrayList<Booking>> alugueres;


    public CampingService(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.espacos = new ArrayList<>();
        this.clients = new HashSet<>();
        this.alugueres = new HashMap<>();
    }

    public boolean registerClient(int taxId, String name, ClientType type){
        Client c = new Client(taxId, name, type);
        if(clients.contains(c)){
            return false;
        }
        else{
            clients.add(c);
            return true;
        }
    }

    public Client getClient(int taxId){
        for(Client c: clients){
            if(c.getNumeroContribuinte() == taxId){
                return c;
            }
        }
        
        return null;
    }

    public void addCampingSpace(CampingSpace campingSpace){
        espacos.add(campingSpace);
    }

    public void addCampingSpaces(Collection<CampingSpace> campingSpaces){
        for(CampingSpace c: campingSpaces){
            espacos.add(c);
        }
    }

    public boolean checkAvailability(CampingSpace campingSpace, LocalDate startDate, LocalDate endDate){
        for(ArrayList<Booking> bookings : alugueres.values()) {
            for(Booking b : bookings) {
                String dataInicio = b.getInicio();
                String dataFim = b.getFim();
                if (b.getEspaco().equals(campingSpace)) {
                    LocalDate inicio = LocalDate.parse(dataInicio);
                    LocalDate fim = LocalDate.parse(dataFim);
                    // Verifica se há sobreposição de datas
                    if (!(endDate.isBefore(inicio) || startDate.isAfter(fim))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public List<CampingSpace> findAvailableCampingSpaces(SpaceType spaceType, LocalDate fromDate, int duration, int[] minDimensions){
        ArrayList<CampingSpace> disponiveis = new ArrayList<>();
        LocalDate endDate = fromDate.plusDays(duration);
        for (CampingSpace c : espacos) {
            if (c.getType() == spaceType) {
                int[] dims = c.getDimensoes();
                if (dims[0] >= minDimensions[0] && dims[1] >= minDimensions[1]) {
                    if (checkAvailability(c, fromDate, endDate)) {
                        disponiveis.add(c);
                    }
                }
            }
        }
        return disponiveis;
    }

    public boolean bookCampingSpace(Client client, CampingSpace campingSpace, LocalDate startDate, int duration){
        LocalDate endDate = startDate.plusDays(duration);
        
        if(campingSpace.getType() == SpaceType.CARAVAN && client.getTipo()== ClientType.NORMAL){
            return false;
        }
        if(!checkAvailability(campingSpace, startDate, endDate)){
            return false;
        }
        Booking b = new Booking(startDate.toString(), endDate.toString(), campingSpace);
        if(alugueres.containsKey(client)){
            if(alugueres.get(client)== null){
                ArrayList<Booking> bo = new ArrayList<>();
                bo.add(b);
                alugueres.put(client, bo);
            }
            else{
                ArrayList<Booking> bo = alugueres.get(client);
                bo.add(b);
                alugueres.replace(client, bo);
            }
        } else{
                ArrayList<Booking> bo = new ArrayList<>();
                bo.add(b);
                alugueres.put(client, bo);
        }
        return true;
    }

    public double calculateTotalCost(CampingSpace campingSpace, int duration){
        return campingSpace.getPrecoDia()*duration;
    }

    public List<String> listBookings(){
        ArrayList<String> info = new ArrayList<>();
        for(ArrayList<Booking> bookings: alugueres.values()){
            for(Booking bo : bookings){
                info.add(bo.toString());

            }
        }
        return info;
    }

    public List<String> listBookings(SpaceType spaceType){
        ArrayList<String> info = new ArrayList<>();
        for(ArrayList<Booking> bookings: alugueres.values()){
            for(Booking bo : bookings){
                if(bo.getEspaco().getType()==spaceType){
                    info.add(bo.toString());
                }

            }
        }
        return info;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<CampingSpace> getEspacos() {
        return espacos;
    }

    public void setEspacos(ArrayList<CampingSpace> espacos) {
        this.espacos = espacos;
    }

    public HashSet<Client> getClients() {
        return clients;
    }

    public void setClients(HashSet<Client> clients) {
        this.clients = clients;
    }

    public HashMap<Client, ArrayList<Booking>> getAlugueres() {
        return alugueres;
    }

    public void setAlugueres(HashMap<Client, ArrayList<Booking>> alugueres) {
        this.alugueres = alugueres;
    }

    public ArrayList<CampingSpace> getAvailableSpacesByTotalArea(LocalDate startDate, int duration){
        ArrayList<CampingSpace> disponiveis = new ArrayList<>();
        LocalDate endDate = startDate.plusDays(duration);
        for (CampingSpace c : espacos) {
            if (checkAvailability(c, startDate, endDate)) {
                disponiveis.add(c);
            }
        }
        disponiveis.sort((c1, c2) -> {
            int a1 = c1.getDimensoes()[0] * c1.getDimensoes()[1];
            int a2 = c2.getDimensoes()[0] * c2.getDimensoes()[1];
            return Integer.compare(a2, a1);
        });
        return disponiveis;
    }
    
}


