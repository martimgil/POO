package aula09.Ex2;

public class CommercialPlane extends Plane{
    private int numeroTripulantes;

    public CommercialPlane(String identificadorUnico, String fabricante, String modelo, int anoProducao,
            int numeroMaximoPassageiros, int velocidadeMaxima, int numeroTripulantes) {
        super(identificadorUnico, fabricante, modelo, anoProducao, numeroMaximoPassageiros, velocidadeMaxima);
        this.numeroTripulantes = numeroTripulantes;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    @Override
    public String toString() {
        return super.toString() +"numeroTripulantes=" + numeroTripulantes + "]";
    }

    @Override
    public String getPlaneType(){
        return "Comercial";
    }
    

}
