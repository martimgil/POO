package TesteFinal.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class ConcertManager {
    private HashMap<Integer, Concert> concertos;

    public ConcertManager() {
        this.concertos = new HashMap<>();
    }

    public void addConcert(Concert c){
        concertos.put(c.getId(), c);
    }

    public void removeConcert(int id){
        concertos.remove(id);
    }

    public Concert getConcert(int id){
        if(concertos.containsKey(id)){
            return concertos.get(id);
        }
        return null;
    }

    public double calculateConcertProfit(int id){
        if(concertos.containsKey(id)){
            StandardConcertProfitCalculator scpc = new StandardConcertProfitCalculator();
            return scpc.calculateConcertProfit(concertos.get(id));
        }
        return -1;
    }

    public void printAllConcerts(){
        for(Concert c: concertos.values()){
            System.out.println(c.toString());
        }
    }

    public void sortConcertsByProfit(){

        ArrayList<Concert> ordem = new ArrayList<>();

        for(Concert c: concertos.values()){
            ordem.add(c);
        }

        Collections.sort(ordem, new Comparator<Concert>() {
            public int compare(Concert c1, Concert c2){
                int mesC1 = c1.getDataInicio().getMonthValue();
                int mesC2 = c2.getDataInicio().getMonthValue();


                StandardConcertProfitCalculator scpc = new StandardConcertProfitCalculator();
                double valorC1 = scpc.calculateConcertProfit(c1);
                double valorC2 = scpc.calculateConcertProfit(c2);

                if(mesC1!= mesC2){
                    return Integer.compare(mesC1, mesC2);
                } else {
                    return Double.compare(valorC2, valorC1);
                }
            }
        });

        for(Concert c: ordem){
            System.out.println(c.toString());
        }
    }

    public void readFile(String fich){
        try {
            Scanner sc = new Scanner(new File(fich));
            sc.nextLine();
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String info[] = line.split(";");
                int id = Integer.parseInt(info[0]);
                double duracao = Double.parseDouble(info[1].replaceFirst("^\\s+", "")); 
                String local = info[2].replaceFirst("^\\s+", "");
                String dataHora = info[3].replaceFirst("^\\s+", "");

                Concert c = new Concert(id, duracao, local, dataHora);
                if(concertos.containsKey(id)){
                    concertos.replace(id, c);
                } else {
                    concertos.put(id, c);
                }
            }

            sc.close();

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o ficheiro: " + e.getMessage());
        }
    }

    public void writeFile(String fich){
        try {        
            FileWriter fw = new FileWriter(new File(fich));
            StandardConcertProfitCalculator scpc = new StandardConcertProfitCalculator();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            for(Concert c: concertos.values()){
                fw.write(c.getId() + ";" + c.getDuracao() + ";" + c.getLocal() + ";" + c.getDataInicio().format(formatter)+";"+scpc.calculateConcertProfit(c)+"\n");

            }

            fw.close();
        } catch (IOException e) {            
            System.out.println("Ocorreu um erro ao ler o ficheiro: " + e.getMessage());
        }

    }


    
    
}
