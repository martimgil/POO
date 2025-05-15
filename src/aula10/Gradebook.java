package aula10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Gradebook {
    List<Student> students = new ArrayList<>();

    public void load(String ficheiroEntrada) {
        try (Scanner sc = new Scanner(new File(ficheiroEntrada))) {
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] info = linha.split("\\|");
                try {
                    List<Double> notas = Arrays.asList(
                        Double.parseDouble(info[1]), 
                        Double.parseDouble(info[2])
                    );
                    students.add(new Student(info[0], notas));
                } catch (NumberFormatException e) {
                    System.err.println("Erro: Formato inválido de nota na linha - " + linha);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Erro: Ficheiro não encontrado - " + ficheiroEntrada);
        }
    }

    public void removeStudent(String Name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(Name)) {
                students.remove(i);
                System.out.println("Estudante '" + Name + "' removido com sucesso.");
                return;
            }
        }
        System.err.println("Erro: Estudante com o Name '" + Name + "' não encontrado.");
    }
    
    public void addStudent(Student student) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(student.getName())) {
                System.err.println("Erro: Estudante com o Name '" + student.getName() + "' já existe.");
                return;
            }
        }
        students.add(student);
        System.out.println("Estudante '" + student.getName() + "' adicionado com sucesso.");
    }
    
    public Student getStudent(String Name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(Name)) {
                return student;
            }
        }
        System.err.println("Erro: Estudante com o Name '" + Name + "' não encontrado.");
        return null; 
    }
    
    public double calculateAverageGrade(String name){
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                List<Double> grades = student.getGrades();
                if (grades.isEmpty()) {
                    return 0.0;
                }
                double soma = 0.0;
                for (Double grade : grades) {
                    soma += grade;
                }
                return soma / grades.size();
            }
        }
        return 0.0;
    }
}