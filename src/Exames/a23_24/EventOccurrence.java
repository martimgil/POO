package Exames.a23_24;

public class EventOccurrence {
    private Place local;
    private String dataHora;
    
    public EventOccurrence(Place local, String dataHora) {
        this.local = local;
        this.dataHora = dataHora;
    }

    public Place getLocal() {
        return local;
    }

    public void setLocal(Place local) {
        this.local = local;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    
}
