package EstudoCasa.aula8.Ex1;

public class Veiculo  implements IKmPercorridos{
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int distanciaTotal = 0;
    private int ultimoTrajeto = 0;

    public Veiculo(String matricula, String marca, String modelo, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    @Override
    public void trajeto(int quilometros){
        this.ultimoTrajeto = quilometros;
        this.distanciaTotal += quilometros;
    }

    @Override
    public int ultimoTrajeto(){
        return this.ultimoTrajeto;
    }

    @Override
    public int distanciaTotal(){
        return this.distanciaTotal;
    }
    
}
