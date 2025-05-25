package EstudoCasa.aula8.Ex1;

public class Atleta  implements IKmPercorridos{
    private int ultimoTrajeto;
    private int distanciaTotal = 0;
    


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
    
}
