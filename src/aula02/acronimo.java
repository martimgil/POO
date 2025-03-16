package aula02;
import java.util.Scanner;


public class acronimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a="";

        System.out.print("Introduza uma frase: ");
        String frase = sc.nextLine();

        for(int i=0; i<frase.length(); i++){
            if(Character.isUpperCase(frase.charAt(i)) == true){
                a +=frase.charAt(i);
            }
        }

        System.out.println("Acrónimo: " + a);
        sc.close();


    }


    
    
}
