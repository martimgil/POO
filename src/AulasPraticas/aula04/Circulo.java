package aula04;

class Circulo {
    private double raio;

    public Circulo(double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
    }


    public double areaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public double perimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(raio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circulo other = (Circulo) obj;
        if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
            return false;
        return true;
    }

    
    
}