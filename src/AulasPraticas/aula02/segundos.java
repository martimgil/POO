package aula02;
import java.util.Scanner;

public class segundos {
    public static void main(String[] args) {
        int segundos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Segundos? ");
        segundos = sc.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos%3600)/60;
        segundos = (segundos%3600)%3600;
        System.out.println(segundos +":"+minutos+":"+horas);

        sc.close();

        
    }
}
