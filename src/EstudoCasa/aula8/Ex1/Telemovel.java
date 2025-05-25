package EstudoCasa.aula8.Ex1;

public class Telemovel implements IGestaoBateria{
    private String numero;
    private double carga;
    private double cargaMaxima;

    public Telemovel(String numero, double cargaMaxima) {
        this.numero = numero;
        this.cargaMaxima = cargaMaxima;
        this.carga = cargaMaxima;
    }

    public double cargaDisponivel(){
        return carga;
    }

    public void carregar(double percentagem){
        if ((carga+percentagem)<cargaMaxima){
            carga+=percentagem;
        }
    }

    public void limitarCargaMaxima(double percentagem) {
        cargaMaxima = percentagem;
    }
    
}
