package aula10.ex2;

import java.util.List;

public class SimpleGradeCalculator implements IGradeCalculator{
    
    public double calculate(List<Double> grades){
        double soma = 0;
        int count = 0;

        for(double grade: grades){
            soma+=grade;
            count++;
        }

        double media = soma/count;
        
        return media;
    }
}
