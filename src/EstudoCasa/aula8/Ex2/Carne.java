package EstudoCasa.aula8.Ex2;

public class Carne extends Alimento{
    public enum VariedadeCarne{
        VACA, PORCO, FRANGO, PERU, OUTRA
    }

    private VariedadeCarne variedade;

    public Carne(double proteinas, double calorias, double peso, VariedadeCarne variedade) {
        super(proteinas, calorias, peso);
        this.variedade = variedade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((variedade == null) ? 0 : variedade.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carne other = (Carne) obj;
        if (variedade != other.variedade)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Carne [variedade=" + variedade + "]";
    }
    
    
}
