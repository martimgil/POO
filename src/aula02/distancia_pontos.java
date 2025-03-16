package aula02;
import java.util.Scanner;
import java.lang.Math;

public class distancia_pontos {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("X? ");
    double x = sc.nextDouble();
    System.out.println("Y?");
    double y = sc.nextDouble();
    double distancia = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));

    System.out.println("distancia: " + distancia);
    sc.close();

    }
}
