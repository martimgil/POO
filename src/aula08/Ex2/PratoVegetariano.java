package aula08.Ex2;

public class PratoVegetariano extends Prato {

    public PratoVegetariano(String nome) {
        super(nome);
    }
    
    @Override
    public String toString() {
        return "Prato Vegetariano: " + super.nome;
    }
    
}
