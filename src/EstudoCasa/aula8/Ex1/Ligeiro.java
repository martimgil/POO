package EstudoCasa.aula8.Ex1;

public class Ligeiro extends Veiculo {
    private int numeroQuadro;
    private int capacidadeBagageira;

    
    public Ligeiro(String matricula, String marca, String modelo, int potencia, int numeroQuadro,
            int capacidadeBagageira) {
        super(matricula, marca, modelo, potencia);
        this.numeroQuadro = numeroQuadro;
        this.capacidadeBagageira = capacidadeBagageira;
    }

    
    
}
