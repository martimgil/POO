package EstudoCasa.aula8.Ex1;

public class Taxi extends Ligeiro {
    private int numeroLicenca;

    public Taxi(String matricula, String marca, String modelo, int potencia, int numeroQuadro,
            int capacidadeBagageira, int numeroLicenca) {
        super(matricula, marca, modelo, potencia, numeroQuadro, capacidadeBagageira);
        this.numeroLicenca = numeroLicenca;
    }
}
