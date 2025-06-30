import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private int id;
    private static int NEXT_ID = 1;
    private double horasTrabalho;
    private String descricaoServico;
    private LocalDateTime dataHoraServico;


    public Transaction(String descricaoServico, String dhServico,double horasTrabalho ) {
        this.id = NEXT_ID++;
        this.horasTrabalho = horasTrabalho;
        this.descricaoServico = descricaoServico;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.dataHoraServico = LocalDateTime.parse(dhServico, formatter);
    }

    public Transaction(int id, double horasTrabalho, String descricaoServico, String dhServico) {
        this.id = id;

        if(id>NEXT_ID){
            NEXT_ID = id;
        }
        
        this.horasTrabalho = horasTrabalho;
        this.descricaoServico = descricaoServico;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.dataHoraServico = LocalDateTime.parse(dhServico, formatter);
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public double getHorasTrabalho() {
        return horasTrabalho;
    }

    public String getDiaDaSemana() {
        return dataHoraServico.getDayOfWeek().toString();
    }


    public void setHorasTrabalho(double horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }


    public String getDescricaoServico() {
        return descricaoServico;
    }


    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }


    public LocalDateTime getDataHoraServico() {
        return dataHoraServico;
    }


    public void setDataHoraServico(LocalDateTime dataHoraServico) {
        this.dataHoraServico = dataHoraServico;
    }


    @Override
    public String toString() {
        return id + "   " + horasTrabalho + "   " + descricaoServico
                + "   " + dataHoraServico;
    }
    
}
