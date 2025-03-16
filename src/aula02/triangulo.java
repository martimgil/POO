package aula02;
import java.util.Scanner;
import java.lang.Math;


public class triangulo {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double c1;
    double c2;

    while (true) {
        System.out.print("Cateto 1?");
        c1 = sc.nextDouble();

        if (c1>0){
            break;
        }
    }

    while (true) {
        System.out.print("Cateto 2?");
        c2 = sc.nextDouble();
    
        if(c2>0){
            break;
        }
        
    }
    double hip = Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));
    

    System.out.println("Hipotenusa: " + hip);

    double angulo = Math.acos(c1 / hip);
    angulo = Math.toDegrees(angulo);

    System.out.println("O valor do ângulo é: " + angulo);
    sc.close();


    }
}
