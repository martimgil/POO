package EstudoCasa.MT2_Treino;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class TravelManager {
    HashMap<Integer, Travel> viagens;

    public TravelManager() {
        this.viagens = new HashMap<>();
    }

    public void addTravel(Travel t){
        viagens.put(t.getId(), t);
    }

    public void removeTravel(int id){
        viagens.remove(id);
    }

    public Travel getTravel(int id){
        if(viagens.containsKey(id)){
            return viagens.get(id);
        } 
        return null;
    }

    public double calculateTravelCost(int id){
        StandardTravelCostCalculator sc = new StandardTravelCostCalculator();
        if(viagens.containsKey(id)){
            return sc.calculateTravelCost(viagens.get(id));
        }
        return -1;
    }

    public void printAllTravels(){
        for(Travel t: viagens.values()){
            System.out.println(t.toString());
        }
    }

    public void sortTravelsByCost(boolean nacional){
        ArrayList<Travel> nac  = new ArrayList<>();
        ArrayList<Travel> internacional = new ArrayList<>();
        for(Travel t:viagens.values()){
            String[] inicio = t.getInicio().split(",");
            String[] fim = t.getFim().split(",");

            if(inicio[1].equals(fim[1])){
                nac.add(t);
            }
            else {
                internacional.add(t);
            }
        }

        if(nacional){
            Collections.sort(nac, new Comparator<Travel>(){
                public int compare(Travel v1, Travel v2){
                    double valor_v1 = calculateTravelCost(v1.getId());
                    double valor_v2 = calculateTravelCost(v2.getId());
                    return Double.compare(valor_v2, valor_v1);
                }
            });

            for(int i = 0; i < nac.size(); i++){
                System.out.println(nac.get(i).toString());
            }
        } 
        else{
            Collections.sort(internacional, new Comparator<Travel>(){
                public int compare(Travel v1, Travel v2){
                    double valor_v1 = calculateTravelCost(v1.getId());
                    double valor_v2 = calculateTravelCost(v2.getId());
                    return Double.compare(valor_v2, valor_v1);
                }
            });

            for(int i = 0; i < internacional.size(); i++){
                System.out.println(internacional.get(i).toString());
            }
        }
        
    }

    public void readFile(String fich){
        try {
            Scanner sc = new Scanner(new File(fich));
            sc.nextLine();
            while(sc.hasNextLine()){
                String[] info = sc.nextLine().replaceAll("\\s+", "").split(";");
                if(viagens.containsKey(Integer.parseInt(info[0]))){
                    Travel tv = new Travel(Integer.parseInt(info[0]),Integer.parseInt(info[1]), info[2], info[3]);

                    viagens.replace(tv.getId(), tv);
                } else {
                    Travel tv = new Travel(Integer.parseInt(info[1]), info[2], info[3]);
                    viagens.put(tv.getId(), tv);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }
    }

    public void writeFile(String fich){
        try {
            FileWriter fc = new FileWriter(new File(fich));
            for(Travel t: viagens.values()){
                fc.write(t.toString()+"\n");
            }
            fc.close();
            
        } catch (java.io.IOException e) {
            System.out.println("Erro ao escrever no ficheiro: " + e.getMessage());
        }

    }


    
}
