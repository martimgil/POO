package aula10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class EnergyUsageReport {

    private HashMap<Integer, List<Integer>> dados;
    private static int count  = 0;

    public void load(String ficheiroEntrada) {
        try (Scanner sc = new Scanner(new File(ficheiroEntrada))) {
            while (sc.hasNextLine()) {
                String[] parts = sc.nextLine().split("\\|");
                List<Integer> values = Arrays.stream(parts).map(Integer::parseInt).toList();
                dados.put(count, values);
                count++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Erro: Ficheiro não encontrado - " + ficheiroEntrada);
        }
    }

    public void addCustomer(Customer customer){
        // Convert List<Double> to List<Integer>
        List<Integer> readingsAsInt = customer.getMeterReadings()
            .stream()
            .map(Double::intValue)
            .toList();
        dados.put(customer.getCustomerId(), readingsAsInt);
    }

    public void removeCustomer(int id){
        dados.remove(id);
    }

    public void getCustomer(int id){
        dados.get(id);
    }

    public int calculateTotalUsage(int id){
        List<Integer> consumo = dados.get(id);
        int soma = 0;
        for(int cons: consumo){
            soma += cons;
        }

        return soma;
    }

    public void generateReport(String name){
        
    }
}
