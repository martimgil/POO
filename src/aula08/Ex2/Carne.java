package aula08.Ex2;

public class Carne extends Alimento{
    private String variedade;

    public Carne(String variedade, int proteinas, int calorias, int peso) {
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
        if (variedade == null) {
            if (other.variedade != null)
                return false;
        } else if (!variedade.equals(other.variedade))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Carne [variedade=" + variedade + "]";
    }

    
    
}
