package aula09.Ex2;

public class MilitaryPlane extends Plane {
    private int numeroMunicoes;

    public MilitaryPlane(String identificadorUnico, String fabricante, String modelo, int anoProducao,
            int numeroMaximoPassageiros, int velocidadeMaxima, int numeroMunicoes) {
        super(identificadorUnico, fabricante, modelo, anoProducao, numeroMaximoPassageiros, velocidadeMaxima);
        this.numeroMunicoes = numeroMunicoes;
    }

    @Override
    public String toString() {
        return "MilitaryPlane [numeroMunicoes=" + numeroMunicoes + ", getIdentificadorUnico()="
                + getIdentificadorUnico() + ", getFabricante()=" + getFabricante() + ", getModelo()=" + getModelo()
                + ", getAnoProducao()=" + getAnoProducao() + ", getNumeroMaximoPassageiros()="
                + getNumeroMaximoPassageiros() + ", getVelocidadeMaxima()=" + getVelocidadeMaxima() + "]";
    }
    
    @Override
    public String getPlaneType(){
        return "Militar";
    }
}
