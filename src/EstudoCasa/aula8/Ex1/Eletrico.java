package EstudoCasa.aula8.Ex1;

public class Eletrico extends Ligeiro implements IGestaoBateria{
    private double carga;
    private double limite;

    
    


    public Eletrico(String matricula, String marca, String modelo, int potencia, int numeroQuadro,
            int capacidadeBagageira, double carga, double limite) {
        super(matricula, marca, modelo, potencia, numeroQuadro, capacidadeBagageira);
        this.carga = carga;
        this.limite = limite;
    }

    public double cargaDisponivel(){
        return carga;
    }

    public void carregar(double percentagem){
       if ((percentagem + carga)<=limite){
        carga += percentagem;
       } 
    }

    public void limitarCargaMaxima(double percentagem){
        limite = percentagem;
    }
    
}
