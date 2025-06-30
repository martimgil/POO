package aula03;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.lang.String;
import java.util.Scanner;

import aula02.strings;

import java.time.LocalDate;
import java.time.Year;

public class Calendario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        String data;
        while (true) {
            System.out.print("Data(mm/yyyy): ");
            data = sc.nextLine();
            if (data.matches("(0[1-9]|1[0-2])/\\d{4}")) {
            break;
            } else {
            System.out.println("Formato inválido. Tente novamente.");
            }
        }


        

        


        System.out.print("First day of the month: ");
        int dia = sc.nextInt();

        if (dia<0){
            LocalDate today = LocalDate.now();
            dia = today.getDayOfWeek().getValue();
    
        }

        String[] data2 = data.split("/");

        int ano = Integer.parseInt(data2[1]);
        int mes = Integer.parseInt(data2[0]);


        
        String mes2 = nomeMes(mes);
        int numDias = dayMonth(mes, ano);

        System.out.printf(mes2 +" "+ ano +"\n");
        System.out.printf("%2s %2s %2s %2s %2s %2s %2s\n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
    

        for (int i = 0; i < dia; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= numDias; i++) {
            System.out.printf("%2d ", i);
            if ((i + dia) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();



    }   
    
    public static String nomeMes(int mes){
        if (mes==1){
            return "January";
        }
        else if (mes==2){
            return "February";
        } else if (mes==3){
            return "March";
        } else if (mes==4){
            return "April";
        }
        else if(mes==5){
            return "May";
        } else if (mes==6){
            return "June";
        } else if (mes==7){
            return "July";
        } else if(mes==8){
            return "August";
        } else if (mes==9){
            return "September";
        } else if(mes==10){
            return "October";
        } else if (mes==11){
            return "November";
        } else {
            return "December";
        }


    }

    public static int dayMonth(int mes, int ano){
        boolean leapYear  = Year.isLeap(ano);
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return 31;
        } else if (mes==4|| mes==6|| mes == 9 || mes==11){
            return 30;
        } else if (mes==2 && leapYear == true){
            return 29;
        } else if (mes==2 && leapYear == false){
            return 28;
        }
        return 0; 
    }
}
