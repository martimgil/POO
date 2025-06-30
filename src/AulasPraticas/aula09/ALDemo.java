package aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import aula06.Pessoa;
import aula06.DateYMD;
import aula07.Date;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for(int i=10; i<=100; i+=10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for(int i=0; i<c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        Collections.sort(c2);
        System.out.println(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        Set<Pessoa> c3 = new HashSet<>();

        c3.add(new Pessoa("Ana Silva", 123456789, new DateYMD(1995, 5, 12)));
        c3.add(new Pessoa("Bruno Costa", 234567890, new DateYMD(1988, 11, 3)));
        c3.add(new Pessoa("Carla Sousa", 345678901, new DateYMD(2001, 7, 21)));
        c3.add(new Pessoa("David Ramos", 456789012, new DateYMD(1992, 2, 28)));
        c3.add(new Pessoa("Eduarda Lima", 567890123, new DateYMD(1985, 9, 15)));

        System.out.println("Elementos do Set c3:");
        for (Pessoa p : c3) {
            System.out.println(p);
        }

        // Verifique a ordem da listagem relativamente à ordem de inserção
        System.out.println("Nota: A ordem dos elementos num HashSet não é garantida e pode ser diferente da ordem de inserção.");

        // Teste a inserção de elementos repetidos
        Pessoa pessoaRepetida = new Pessoa("Ana Silva", 123456789, new DateYMD(1995, 5, 12));
        boolean added = c3.add(pessoaRepetida);
        System.out.println("Tentativa de adicionar elemento repetido: " + (added ? "Adicionado" : "Não adicionado (duplicado)"));
        System.out.println("Elementos do Set c3 após tentativa de inserção repetida:");
        for (Pessoa p : c3) {
            System.out.println(p);
        }

        Set<Date> c4 = new TreeSet<>();
        c4.add(new DateYMD(2023, 5, 10)); // DateYMD
        c4.add(new DateYMD(2022, 12, 25)); // DateYMD
        c4.add(new DateYMD(2024, 1, 1)); // DateYMD
        c4.add(new Date(2021, 7, 15)); // Date (pode ser DateYMD ou DateND dependendo da implementação)
        c4.add(new Date(2023, 3, 8)); // Outra data

        
        System.out.println("Elementos do TreeSet c4 (datas):");
        for (Date d : c4) {
            System.out.println(d);
        }
        System.out.println("Nota: A ordem dos elementos num TreeSet é definida pela ordem natural (compareTo) das datas, não pela ordem de inserção.");

    }
}
