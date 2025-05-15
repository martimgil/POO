package EstudoMT1.aula07;

public class Escultura extends Obra{
    private String material;
    private int exemplares;

    public Escultura(String nome, String autor, double precoBase, String material, int exemplares) {
        super(nome, autor, precoBase);
        this.material = material;
        this.exemplares = exemplares;
    }

    @Override
    public String toString() {
        return  super.toString() + "Material: " + material + ", Exemplares: " + exemplares + "\n";
    }


    
}
