package aula10.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class EnergyUsageReport {

    private HashMap<Integer, List<Integer>> dados;
    private static int count  = 0;

    public EnergyUsageReport() {
        this.dados = new HashMap<>();
    }

    public void load(String ficheiroEntrada) {
        try (Scanner sc = new Scanner(new File(ficheiroEntrada))) {
            while (sc.hasNextLine()) {
                String[] parts = sc.nextLine().split("\\|");
                int id = Integer.parseInt(parts[0]);
                List<Integer> values = Arrays.stream(parts)
                    .skip(1)
                    .map(Integer::parseInt)
                    .toList();
                dados.put(id, values);
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

    public Customer getCustomer(int id){
        List<Integer> readings = dados.get(id);
        if (readings == null) {
            return null;
        }
        // Assuming Customer has a constructor: Customer(int id, List<Double> readings)
        List<Double> readingsAsDouble = readings.stream()
            .map(Integer::doubleValue)
            .toList();
        return new Customer(id, readingsAsDouble);
    }

    public int calculateTotalUsage(int id){
        List<Integer> consumo = dados.get(id);
        if (consumo == null) {
            System.err.println("Cliente com ID " + id + " não encontrado.");
            return 0;
        }
        int soma = 0;
        for(int cons: consumo){
            soma += cons;
        }
        return soma;
}

    public void generateReport(String name){
        
    }
}
