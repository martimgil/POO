package aula08.Ex1;

public class Eletrico extends AutomovelLigeiro implements IGestaoBateria{
    private double carga;
    private double cargaMaxima;

    public Eletrico(String matricula, String marca, String modelo, int potencia, int numeroQuadro,
            int capacidadeBagageira, double carga, double cargaMaxima) {
        super(matricula, marca, modelo, potencia, numeroQuadro, capacidadeBagageira);
        this.carga = carga;
        this.cargaMaxima = cargaMaxima;
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
