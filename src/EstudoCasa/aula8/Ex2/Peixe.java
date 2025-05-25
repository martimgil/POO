package EstudoCasa.aula8.Ex2;

public class Peixe extends Alimento{
    public enum TipoPeixe{
        CONGELADO, FRESCO
    }

    private TipoPeixe tipo;

    public Peixe(double proteinas, double calorias, double peso, TipoPeixe tipo) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        Peixe other = (Peixe) obj;
        if (tipo != other.tipo)
            return false;
        return true;
    }
    
}
