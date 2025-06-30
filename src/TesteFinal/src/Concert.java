import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Concert {
    private static int NEXT_ID = 1;
    private int id;
    private double duracao;
    private String local;
    private LocalDateTime dataInicio;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Concert( String local,String dI, double duracao ) {
        this.id = NEXT_ID++;
        this.duracao = duracao;
        LocalDateTime date = LocalDateTime.parse(dI, formatter);
        this.dataInicio = date;
        this.local = local;
    }

    public Concert(int id, double duracao, String local, String dI) {
        this.id = id;
        this.duracao = duracao;
        LocalDateTime date = LocalDateTime.parse(dI, formatter);
        this.dataInicio = date;
        this.local = local;

        if(id>NEXT_ID){
            NEXT_ID = id;
        }
    }

    public String getPais(){
        String info[] = local.split(",");
        String pais = info[1].replaceFirst("^\\s+", "");
        return pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    @Override
    public String toString() {
        return id + "  " + duracao + "  " + local + "  " + dataInicio.format(formatter) ;
    }
    
}
