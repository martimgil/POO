package aula03;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


public class notas {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notasTeoricas = new ArrayList<>();
        ArrayList<Double> notasPraticas = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> aprovados = new ArrayList<>();
        
        try (Scanner input = new Scanner(new File("notas.txt"))) {
            while(input.hasNextLine()){
                String line = input.nextLine();
                String[] parts = line.split("\t");
                nomes.add(parts[0]);
                notasTeoricas.add(Double.parseDouble(parts[1]));
                notasPraticas.add(Double.parseDouble(parts[2]));

                
      }
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number: " + e.getMessage());
            e.printStackTrace();
        }




        System.out.println("NotaT   NotaP   Pauta");
        for (int i=0; i<nomes.size(); i++){

            String n = nomes.get(i);
            double notaT = notasTeoricas.get(i);
            double notaP = notasPraticas.get(i);

            int notaFinal = calcularNotaFinal(notaT, notaP);

            if (notaFinal>=10){
                aprovados.add(n);
            }


            System.out.printf("%.1f     %.1f    %d%n", notaT, notaP, notaFinal);
        }

        System.out.println("Alunos aprovados: ");

        for (String nome : aprovados) {
            System.out.println(nome);
        }

        scanner.close();

    }
    

    public static int calcularNotaFinal(double notaT, double notaP){
        if(notaT<7.0||notaP<7.0){
            return 66;

        } else {
            return (int) Math.round(0.4*notaT + 0.6*notaP);

        }
    }

    
}
