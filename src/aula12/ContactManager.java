package aula12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ContactManager {
    private ArrayList<Contact> contactos;
    private int emailCount;
    private double callTime;
    private StandartCostCalculator costs;
    private int nextId; // Novo campo para IDs únicos

    public ContactManager() {
        this.contactos = new ArrayList<>();
        this.emailCount = 0;
        this.callTime = 0;
        this.costs = new StandartCostCalculator();
        this.nextId = 0; // Inicializa o próximo ID
    }

    public void addContact(Contact contact) {
        for (Contact c : contactos) {
            if (c.getId() == contact.getId()) {
                System.out.println("Contact with this ID already exists.");
                return;
            }
        }
        contactos.add(contact);
    }

    public void removeContact(int id){
        for(int i = 0; i < contactos.size(); i++){
            if(contactos.get(i).getId() == id){
                contactos.remove(i);
                break;
            }
        }
    }

    public Contact getContact(int id){
        for(Contact c : contactos){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    public void sendEmail(int id){
        for(Contact c : contactos){
            if(c.getId() == id){
                emailCount++;
                break;
            }
        }
    }

    public void call(int id, double minutes){
        for(Contact c: contactos){
            if(c.getId() == id){
                callTime += minutes;
                break;
            }
        }
    }

    public double calculateContactCost(){
        return costs.calculateCost(emailCount, IContactCostCalculator.ContactType.EMAIL)
             + costs.calculateCost(callTime, IContactCostCalculator.ContactType.CELLNUMBER);
    }

    public void printAllContacts(){
        for(Contact c: contactos){
            System.out.println(c);
        }
    }

public void readFile(String file){
    try (Scanner sc = new Scanner(new File(file))) {
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] info = line.split("\\s+");
            // Encontrar o índice do número (primeiro campo inteiro)
            int idx = 0;
            while (idx < info.length && !info[idx].matches("\\d+")) idx++;
            // Nome pode ter espaços
            StringBuilder nomeBuilder = new StringBuilder();
            for (int i = 0; i < idx; i++) {
                if (i > 0) nomeBuilder.append(" ");
                nomeBuilder.append(info[i]);
            }
            String nome = nomeBuilder.toString();
            int numero = Integer.parseInt(info[idx]);
            String email = info[idx+1];
            LocalDate dataNascimento = LocalDate.parse(info[idx+2]);
            Contact c = new Contact(nome, numero, email, dataNascimento);
            addContact(c);
        }
    } catch (FileNotFoundException e) {
        System.err.println("Erro: Ficheiro não encontrado - " + file);
    }
}
    public void writeFile(String file) {
        try {
            StringBuilder sb = new StringBuilder();
            for (Contact c : contactos) {
                sb.append(c.toString()).append(System.lineSeparator());
            }
            Files.write(Paths.get(file), sb.toString().getBytes());
        } catch (IOException e) {
            System.err.println("Erro: Não foi possível escrever no ficheiro - " + file);
        }
    }
}