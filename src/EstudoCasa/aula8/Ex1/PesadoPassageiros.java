package EstudoCasa.aula8.Ex1;

public class PesadoPassageiros extends Veiculo{
    private String numeroQuadro;
    private int peso;
    private int passageiros;

    public PesadoPassageiros(String matricula, String marca, String modelo, int potencia, String numeroQuadro, int peso,
            int passageiros) {
        super(matricula, marca, modelo, potencia);
        this.numeroQuadro = numeroQuadro;
        this.peso = peso;
        this.passageiros = passageiros;
    }

    
    
}
