package Exames.a22_23;

public class Booking {
    private String inicio;
    private String fim;
    private CampingSpace espaco;

    public Booking(String inicio, String fim, CampingSpace espaco) {
        this.inicio = inicio;
        this.fim = fim;
        this.espaco = espaco;
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

    public CampingSpace getEspaco() {
        return espaco;
    }

    public void setEspaco(CampingSpace espaco) {
        this.espaco = espaco;
    }

    @Override
    public String toString() {
        return "Booking [inicio=" + inicio + ", fim=" + fim + ", espaco=" + espaco + "]";
    }

    
    
}

