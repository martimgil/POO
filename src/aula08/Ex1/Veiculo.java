package aula08.Ex1;

public abstract class Veiculo implements IKmPercorridos {
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int distanciaTotal;
    private int ultimoTrajeto;

    public Veiculo(String matricula, String marca, String modelo, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.distanciaTotal = 0;
        this.ultimoTrajeto = 0;
    }

    @Override
    public void trajeto(int quilometros) {
        this.ultimoTrajeto = quilometros;
        this.distanciaTotal += quilometros;
    }

    @Override
    public int ultimoTrajeto() {
        return this.ultimoTrajeto;
    }

    @Override
    public int distanciaTotal() {
        return this.distanciaTotal;
    }

    @Override
    public String toString() {
        return "Veiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia
                + ", distanciaTotal=" + distanciaTotal + ", ultimoTrajeto=" + ultimoTrajeto + "]";
    }

    

}