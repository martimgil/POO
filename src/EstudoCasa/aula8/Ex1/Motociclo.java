package EstudoCasa.aula8.Ex1;

public class Motociclo extends Veiculo{
    private String tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia, String tipo) {
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }
    
    
}
