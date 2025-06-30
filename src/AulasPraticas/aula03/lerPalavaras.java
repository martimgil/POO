package aula03;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class lerPalavaras {
    public static void main(String[] args) throws IOException{ 
  Scanner input = new Scanner(new FileReader("src/aula03/words.txt")); 
  ArrayList<String> words = new ArrayList<>();
  ArrayList<String> s = new ArrayList<>();

  while (input.hasNext()) { 
   String word = input.next(); 
   if (word.length()>2){
    words.add(word);
   }

   System.out.println(word);


  } 
 } 
}




