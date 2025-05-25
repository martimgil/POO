package aula09.Ex2;

public class Plane {
    private String identificadorUnico;
    private String fabricante;
    private String modelo;
    private int anoProducao;
    private int numeroMaximoPassageiros;
    private int velocidadeMaxima;

    public Plane(String identificadorUnico, String fabricante, String modelo, int anoProducao,
            int numeroMaximoPassageiros, int velocidadeMaxima) {
        this.identificadorUnico = identificadorUnico;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoProducao = anoProducao;
        this.numeroMaximoPassageiros = numeroMaximoPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void setIdentificadorUnico(String identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoProducao() {
        return anoProducao;
    }

    public void setAnoProducao(int anoProducao) {
        this.anoProducao = anoProducao;
    }

    public int getNumeroMaximoPassageiros() {
        return numeroMaximoPassageiros;
    }

    public void setNumeroMaximoPassageiros(int numeroMaximoPassageiros) {
        this.numeroMaximoPassageiros = numeroMaximoPassageiros;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Plane [identificadorUnico=" + identificadorUnico + ", fabricante=" + fabricante + ", modelo=" + modelo
                + ", anoProducao=" + anoProducao + ", numeroMaximoPassageiros=" + numeroMaximoPassageiros
                + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }

    public String getPlaneType(){
        return "Plane";
    }
    
    
}
