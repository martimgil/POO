package aula08.Ex1;

public class PesadoMercadorias extends Veiculo {
    private String numeroQuadro;
    private int peso;
    private int numeroPassageiros;

    public PesadoMercadorias(String matricula, String marca, String modelo, int potencia, String numeroQuadro, int peso,
            int numeroPassageiros) {
        super(matricula, marca, modelo, potencia);
        this.numeroQuadro = numeroQuadro;
        this.peso = peso;
        this.numeroPassageiros = numeroPassageiros;
    }
    
}
