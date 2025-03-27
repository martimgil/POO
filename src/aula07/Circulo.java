package aula07;

class Circulo extends Forma{
    private double raio;   

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }


    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + "]";
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