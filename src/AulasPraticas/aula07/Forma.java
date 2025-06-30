package aula07;


public abstract class Forma {
    protected String cor;

    public abstract double calcularPerimetro();
    public abstract double calcularArea();

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Forma forma = (Forma) obj;
        return cor.equals(forma.cor);
    }
    
    @Override
    public int hashCode() {
        return cor.hashCode();
    }
}
