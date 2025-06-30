package Exames.a23_24;

public class Concert extends Event{
    private String artista;

    public Concert(String nome, int duracao, String artista) {
        super(nome, duracao);
        this.artista = artista;
    }
    
    
}
