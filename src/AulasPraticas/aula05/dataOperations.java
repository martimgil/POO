package aula05;

import java.util.Scanner;

public class dataOperations {
    public static void main(String[] args) {
        int day = 1;
        int month = 1; 
        int year = 2000;
        DateYMD date = new DateYMD(day, month, year);
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Date Operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");



            int op  = sc.nextInt();
            

            switch (op) {
                case 1:
                    System.out.println("Enter year:");
                    year = sc.nextInt();
                    System.out.println("Enter month:");
                    month = sc.nextInt();
                    System.out.println("Enter day:");
                    day = sc.nextInt();
                    date.set(day,month,year);
                    break;
                case 2:
                    System.out.println(date.toString());
                    break;
                case 3:
                    date.increment();
                    break;

                case 4:
                    date.decrement();
                    break;
                    
                case 0:
                    sc.close();
                    return;
                default:
                    break;

            }
        }
    
    }
    
}
