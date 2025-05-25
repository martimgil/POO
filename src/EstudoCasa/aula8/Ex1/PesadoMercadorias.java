package EstudoCasa.aula8.Ex1;

public class PesadoMercadorias extends Veiculo{
    private String numeroQuadro;
    private int peso;
    private int cargaMaxima;
    
    public PesadoMercadorias(String matricula, String marca, String modelo, int potencia, String numeroQuadro, int peso,
            int cargaMaxima) {
        super(matricula, marca, modelo, potencia);
        this.numeroQuadro = numeroQuadro;
        this.peso = peso;
        this.cargaMaxima = cargaMaxima;
    }
}
