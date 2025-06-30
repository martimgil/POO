package aula03;
import java.util.Scanner;

public class numeros_primos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int number;

        while (true){
            System.out.print("Insira um número inteiro positivo: ");
            number = sc.nextInt();
            
            if (number > 0){
                break;
            } else{
                System.out.println("Insira um número inteiro positivo válido.");
            }
        }

        int soma = 0;

        for (int i = 2; i <= number; i++){
            if (validatePrime(i)) {
                soma += i;
            }
        }

        System.out.println("Soma dos números primos: " + soma);
        sc.close();
    }

    public static boolean validatePrime(int number){
        if (number<2){
            return false;
        }
        
        for (int i = 2; i <= number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    
}
