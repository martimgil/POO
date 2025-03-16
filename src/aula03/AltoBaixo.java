package aula03;
import java.util.Scanner;
import java.util.Random;

public class AltoBaixo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random n_c = new Random();

        while (true) {
            int numeroAleatorio = n_c.nextInt(100) + 1;
            int tentativas = 0;
            int numero = 0;

            System.out.println("Adivinhar número entre 1 e 100: ");

            while (numero != numeroAleatorio) {
                numero = sc.nextInt();
                tentativas++;

                if (numero < numeroAleatorio) {
                    System.out.println("Número baixo!");
                } else if (numero > numeroAleatorio) {
                    System.out.println("Número alto!");
                } else {
                    System.out.println("Acertou!");
                    System.out.println("Número de tentativas: " + tentativas);
                }
            }

            System.out.print("Do you want to continue? Press (Y)es: ");
            String continuar = sc.next();

            if (!continuar.equalsIgnoreCase("Y")) {
                break;
            }
        }

        sc.close();
    }
}