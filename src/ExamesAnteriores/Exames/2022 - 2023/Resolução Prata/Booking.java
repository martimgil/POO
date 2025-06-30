package teste2223;

public class Booking {
    private String inicio;
    private String fim;
    //assocido a um espaço de campismo/caravanismo
    public Booking(String inicio, String fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public String toString() {
        return "Data do Início: " + inicio + " -> Data do Fim: " + fim;
    }
}
