package aula05;

import java.util.Scanner;

public class testCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendario calendar = null;

        while (true) {
            System.out.println("Calendar Operations: ");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("0 - exit");
            System.out.println("Operation: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("year: ");
                    int year = sc.nextInt();
                    System.out.print("First Weekday Of Year: ");
                    int firstWeekdayOfYear = sc.nextInt();
                    calendar = new Calendario(year, firstWeekdayOfYear);
                    System.out.println("New calendar created for year " + year);
                    break;

                case 2:
                    System.out.print("Month: ");
                    int month = sc.nextInt();
                    System.out.println(calendar.printMonth(month));         
                    System.out.println("Please create a calendar first.");
                    break;

                case 3:
                    
                    System.out.print(calendar.toString());
                    System.out.println("Please create a calendar first.");
                    break;

                case 0:
                    sc.close();
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }
    }
}