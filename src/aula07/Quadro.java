package aula07;

public class Quadro extends Obra{
    private String colorType;
    private boolean emoldurada;
    private String size;

    public Quadro(String nome, String autor, int precoBase, String colorType, boolean emoldurada, String size) {
        super(nome, autor, precoBase);
        this.colorType = colorType;
        this.emoldurada = emoldurada;
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo de Tinta: " +  colorType + " Emoldurada: " + emoldurada + " Tamanho: " + size + " ";

    }

    

    
    

}
