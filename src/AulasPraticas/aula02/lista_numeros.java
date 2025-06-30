package aula02;
import java.util.ArrayList;
import java.util.Scanner;

public class lista_numeros {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();
        numbers.add(n);

        while (true){
            System.out.print("Número: ");
            n = sc.nextInt();
            
            if (n == numbers.get(0)) {
                break;
            } else {
                numbers.add(n);

            }


        }

        int soma = 0;
        int max = numbers.get(0);
        int min = numbers.get(0);


        for (Integer i: numbers){
            soma += i;

            if (i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        
        Double media = (double) soma / numbers.size();

        System.out.println("Média: " + media);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);


        System.out.println("Números acima da média de " + media + ":");
        for(Integer i: numbers){
            if (i>media){
                System.out.println(i);
            }
        }
        
        sc.close();
    }
    
}
