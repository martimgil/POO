package aula03;

import java.io.*;
import java.util.*;

class Person {
    String name;
    double noteP;
    double noteT;

    Person(String name, double noteP, double noteT) {
        this.name = name;
        this.noteP = noteP;
        this.noteT = noteT;
    }
}

public class llms {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        String fileName = "src/aula03/data.tsv";        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t"); // Split by tab
                if (parts.length == 3) {
                    String name = parts[0];
                    double noteP = Double.parseDouble(parts[1]);
                    double noteT = Double.parseDouble(parts[2]);
                    people.add(new Person(name, noteP, noteT));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Calculate averages
        double totalNoteP = 0, totalNoteT = 0;
        for (Person p : people) {
            totalNoteP += p.noteP;
            totalNoteT += p.noteT;
        }
        
        double avgNoteP = totalNoteP / people.size();
        double avgNoteT = totalNoteT / people.size();
        double avgNote = (avgNoteP+avgNoteT)/2;
        
        System.out.printf("Average NoteP: %.2f\n", avgNoteP);
        System.out.printf("Average NoteT: %.2f\n", avgNoteT);
        System.out.printf("Average Note: %.2f\n", avgNote);
        // Print names of people with noteT above the overall average
        System.out.println("People with NoteT above the average:");
        for (Person p : people) {
            if (p.noteT > avgNoteT) {
                System.out.println(p.name);
            }
        }

        System.out.println("People with Note above the average: ");
        for (Person p: people){
            double finalNote = (p.noteP + p.noteT)/2;
            if(finalNote>avgNote){
                System.out.println(p.name);
            }
        }

    }
}
