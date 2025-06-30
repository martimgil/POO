import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class TransactionManager {
    private HashMap<Integer, Transaction> servicos;

    public TransactionManager() {
        this.servicos = new HashMap<>();
    }

    public void addTransaction(Transaction t){
        servicos.put(t.getId(), t);
    }

    public void removeTransaction(int id){
        servicos.remove(id);
    }

    public Transaction getTransaction(int id){
        if(servicos.containsKey(id)){
            return servicos.get(id);
        } else{
            return null;
        }
    }

    public double calculateTransactionCost(int id){
        if(servicos.containsKey(id)){
            Transaction t = servicos.get(id);
            StandardTransactionCalculator stc = new StandardTransactionCalculator();
            return stc.calculateTransactionCost(t);
        } else{
            return -1;
        }
    }

    public void printAllTransactions(){
        for(Transaction t: servicos.values()){
            System.out.println(t.toString());
        }
    }

    public void sortTransactionsByCost(){
        HashMap<String, Integer> diasSemana = new HashMap<>();
        ArrayList<Transaction> ordemDiaSemana = new ArrayList<>();
        diasSemana.put("MONDAY", 1 );
        diasSemana.put("TUESDAY",2);
        diasSemana.put("WEDNESDAY",3);
        diasSemana.put("THURSDAY",4);
        diasSemana.put("FRIDAY", 5);
        diasSemana.put("SATURDAY", 6);
        diasSemana.put("SUNDAY", 7);

        for(Transaction t: servicos.values()){
            ordemDiaSemana.add(t);
        }

        Collections.sort(ordemDiaSemana, new Comparator<Transaction>() {
            public int compare(Transaction t1, Transaction t2){
            String diaSemanaT1 = t1.getDiaDaSemana();
            String diaSemanaT2 = t2.getDiaDaSemana();

            int diaSemanaT1value = diasSemana.get(diaSemanaT1);
            int diaSemanaT2value = diasSemana.get(diaSemanaT2);

            StandardTransactionCalculator stc = new StandardTransactionCalculator();
            double valorT1 = stc.calculateTransactionCost(t1);
            double valorT2 = stc.calculateTransactionCost(t2);

            if (diaSemanaT1value != diaSemanaT2value) {
                return Integer.compare(diaSemanaT1value, diaSemanaT2value);
            } else {
                return Double.compare(valorT2, valorT1); 
            }
            }
        });

        for(Transaction t: ordemDiaSemana){
            System.out.println(t.toString());
        }

    }

    public void readFile(String fich){
        try {
            Scanner sc = new Scanner(new File(fich));
            sc.nextLine();
            while(sc.hasNextLine()){
                String[] info = sc.nextLine().split(";");
                int id = Integer.parseInt(info[0]);
                double horas = Double.parseDouble(info[1]);
                String descricao = info[2].replaceFirst("^\\s+", "");
                String dataHora = info[3].replaceFirst("^\\s+", "");
                Transaction t = new Transaction(id, horas, descricao, dataHora);
                if(servicos.containsKey(id)){
                    servicos.replace(id, t);
                } else {
                    servicos.put(id, t);
                }
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        }
    }

    public void writeFile(String fich){
        try {
            FileWriter fw = new FileWriter(new File(fich));
            StandardTransactionCalculator stc = new StandardTransactionCalculator();

            for(Transaction t: servicos.values()){
                fw.write(t.getId()+";"+t.getHorasTrabalho()+";"+t.getDescricaoServico()+";"+stc.calculateTransactionCost(t)+"\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());

        }
    }



    
    
}
