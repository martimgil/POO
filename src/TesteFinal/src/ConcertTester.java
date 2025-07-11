package TesteFinal.src;

public class ConcertTester {
    public static void main(String[] args) {
        ConcertManager cm = new ConcertManager();

        // ----------------------------------------------------------
        Concert c1 = new Concert("Madrid, Espanha", "2025-05-27 11:00", 25.0);
        Concert c2 = new Concert("Oslo, Suecia", "2025-05-28 05:00", 35.0);
        cm.addConcert(c1);
        cm.addConcert(c2);
        // ----------------------------------------------------------

        cm.printAllConcerts();

        // ----------------------------------------------------------
        System.out.println(cm.getConcert(1));
        System.out.println(cm.calculateConcertProfit(1));
        System.out.println(cm.getConcert(2));
        System.out.println(cm.calculateConcertProfit(2));
        System.out.println(cm.getConcert(30));              // não existe!
        System.out.println(cm.calculateConcertProfit(30));    // não existe!
        // ----------------------------------------------------------

        System.out.println("---------------");
        cm.sortConcertsByProfit();
        System.out.println("---------------");

        // ----------------------------------------------------------
        cm.readFile("C:\\Users\\Marti\\OneDrive - Universidade de Aveiro\\Universidade\\1ºano\\Programação Orientada a Objetos\\124833\\src\\classicpimba.txt");
        cm.printAllConcerts();

        // ----------------------------------------------------------
        System.out.println(cm.getConcert(1));
        System.out.println(cm.calculateConcertProfit(1));
        System.out.println(cm.getConcert(2));
        System.out.println(cm.calculateConcertProfit(2));
        System.out.println(cm.getConcert(30));
        System.out.println(cm.calculateConcertProfit(30));
        cm.removeConcert(30);
        System.out.println(cm.getConcert(30)); //não existe !
        // ----------------------------------------------------------

        cm.writeFile("result.txt");

        // ----------------------------------------------------------

        System.out.println("---------------");
        cm.sortConcertsByProfit();
        System.out.println("---------------");

        // ----------------------------------------------------------

    }
}
