package EstudoMT1.aula07;

public class ObraDigital  extends Obra{
    private String blockchain;
    private String endereco;


    public ObraDigital(String nome, String autor, double precoBase, String blockchain,
            String endereco) {
        super(nome, autor, precoBase);
        this.blockchain = blockchain;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return super.toString() + "Blockchain: " + blockchain + " Contrato" + endereco + " ";
    }

    
    
}
