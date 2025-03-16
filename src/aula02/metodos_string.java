package aula02;

import java.util.Scanner;

public class metodos_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Insira a frase: ");
        String s = sc.nextLine();
        System.out.println("Números de digitos: "+ countDigits(s));

        System.out.println("Número de espaçoes: " + countSpaces(s));

        Boolean resultado = validateLower(s);

        if (resultado){
            System.out.println("A frase contém apenas minusculas!");
        } else{
            System.out.println("A frase contém maiusculas! ");
        }

        String s_semespaco = removeSpaces(s);
        System.out.println("Frase sem espaço seguidos: "+ s_semespaco);


        if(palindrome(s)){
            System.out.println("É um palindromo!");
        } else{
            System.out.println("Não é um palindromo! ");
        }

        sc.close();
    }

    public static int countDigits(String s){
        int digits = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)) == true){
                digits++;
            };
        }

        return digits;
    }

    public static int countSpaces(String s){
        int spaces = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                spaces++;
            };
        }
        return spaces;
    }

    public static boolean validateLower(String s){

        for(int i=0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i)) == false){

                return false;
            }
        }

        return true;
    }

    public static String removeSpaces(String s){
    
        String s2 = "";

        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i) == ' ' && s.charAt(i+1)==' '){
                continue;
            }
            else {
                s2+=s.charAt(i);
            }
        }

        return s2;
    }


    public static boolean palindrome (String s){

        String s2 = ""; 

        for (int i=s.length()-1; i>=0; i--){
            s2 += s.charAt(i);
        }

        if(!s.equals(s2)){
            return false;
        }

        return true;
    }

    



}
