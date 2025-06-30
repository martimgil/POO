package aula10.ex4;
import java.time.LocalTime;
import java.time.Duration;


class Voo {
    private LocalTime hora;
    private String codigo;
    private String companhia;
    private String origem;
    private Duration atraso;
    private String obs;

    public Voo(String horaStr, String codigo, String origem, String atrasoStr, String obs) {
        this.hora = LocalTime.parse(horaStr);
        this.codigo = codigo;
        this.origem = origem;
        this.atraso = atrasoStr != null ? parseAtraso(atrasoStr) : null;
        this.obs = obs;

    }

