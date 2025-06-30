package Exames.a23_24;

public class Ticket {
    private static int NEXT_ID = 0;
    private int id;
    private Event eventoAssociado;
    private int numeroBilhetes;

    public Ticket(Event eventoAssociado, int numeroBilhetes) {
        this.eventoAssociado = eventoAssociado;
        this.numeroBilhetes = 0;
        this.id = NEXT_ID++;
    }

}
