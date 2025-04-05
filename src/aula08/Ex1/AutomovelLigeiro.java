package aula08.Ex1;

public class AutomovelLigeiro extends Veiculo {
    private int numeroQuadro;
    private int capacidadeBagageira;
    
    public AutomovelLigeiro(String matricula, String marca, String modelo, int potencia, int numeroQuadro,
            int capacidadeBagageira) {
        super(matricula, marca, modelo, potencia);
        this.numeroQuadro = numeroQuadro;
        this.capacidadeBagageira = capacidadeBagageira;
    }


}
