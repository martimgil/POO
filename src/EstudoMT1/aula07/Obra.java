package EstudoMT1.aula07;

public class Obra {
    private String nome;
    private String autor;
    private double precoBase;
    private int identificador;
    private static int NEXT_IDENTIFICADOR = 33;

    public Obra(String nome, String autor, double precoBase) {
        this.nome = nome;
        this.autor = autor;
        this.precoBase = precoBase;
        this.identificador = NEXT_IDENTIFICADOR;
        NEXT_IDENTIFICADOR++;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return super.toString() + "Nome: " + nome + "\nAutor: " + autor + "\nPreco: " + precoBase + "\nIdentificador: " + identificador;
    }

    public String getNome() {
        return nome;
    }
    
    

    

    
}
