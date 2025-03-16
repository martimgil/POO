package aula02;
import java.util.Scanner;


public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma string: ");
        String frase = sc.nextLine();
        String minusculas = frase.toLowerCase();
        System.out.println("Minusculas: " + minusculas);
        String ultimo = frase.substring(frase.length() - 1);
        System.out.println("Último caracter: " + ultimo);
        String primeiros = frase.substring(0, 3);
        System.out.println("Primeios 3 carateres: " + primeiros);
        System.out.println("Insira frase para concatnar: ");
        String frase2 = sc.nextLine();
        String Frase_conc = frase.concat(frase2);
        System.out.println("Frase Junta: " + Frase_conc);
        String Frase_SemEspaco = frase.trim();
        System.out.println("Frase sem espaços: " + Frase_SemEspaco);
        System.out.print("Insira a letra a procurar: ");
        String letra = sc.nextLine();
        int posicao = frase.indexOf(letra);
        System.out.println("Está na posição: " + posicao);
        sc.close();
    }
}
