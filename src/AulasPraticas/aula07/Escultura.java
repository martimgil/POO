package aula07;

public class Escultura extends Obra {
    private String material;
    private int numbers;

    public Escultura(String nome, String autor, int precoBase, String material, int numbers) {
        super(nome, autor, precoBase);
        this.material = material;
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Exemplares: " + numbers + "\n";
    }

    
    

    
}
