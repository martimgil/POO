package EstudoCasa.aula8.Ex2;

public class PratoDieta extends Prato {
    private double limiteCalorias;

    public PratoDieta(String nome, double limiteCalorias) {
        super(nome);
        this.limiteCalorias = limiteCalorias;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(limiteCalorias);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        PratoDieta other = (PratoDieta) obj;
        if (Double.doubleToLongBits(limiteCalorias) != Double.doubleToLongBits(other.limiteCalorias))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PratoDieta [limiteCalorias=" + limiteCalorias + "]";
    }


    
}