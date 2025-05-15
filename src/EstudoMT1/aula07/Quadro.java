package EstudoMT1.aula07;

public class Quadro extends Obra{
    private String tinta;
    private boolean emoldurada;
    private String tamanho;


    public Quadro(String nome, String autor, double precoBase, String tinta, boolean emoldurada,
            String tamanho) {
        super(nome, autor, precoBase);
        this.tinta = tinta;
        this.emoldurada = emoldurada;
        this.tamanho = tamanho;
    }


    @Override
    public String toString() {
        return super.toString() + " Tipo de Tinta: " +  tinta + " Emoldurada: " + emoldurada + " Tamanho: " + tamanho + " ";

    }
    

    
}
