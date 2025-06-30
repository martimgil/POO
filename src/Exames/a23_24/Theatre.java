package Exames.a23_24;

public class Theatre extends Event{
    private String autorPeca;
    private String companhiaTeatral;
    
    public Theatre(String nome, int duracao, String autorPeca, String companhiaTeatral) {
        super(nome, duracao);
        this.autorPeca = autorPeca;
        this.companhiaTeatral = companhiaTeatral;
    }

    
}
