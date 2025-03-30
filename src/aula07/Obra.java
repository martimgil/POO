package aula07;

public class Obra {
    private String nome;
    private String autor;
    private int precoBase;
    private int id;
    public static int NEXT_ID = 33;
    
    
    public Obra(String nome, String autor, int precoBase) {
        this.nome = nome;
        this.autor = autor;
        this.precoBase = precoBase;
        this.id = NEXT_ID++;
    }


    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public String getAutor() {
        return autor;
    }


    public int getPrecoBase() {
        return precoBase;
    }


    @Override
    public String toString() {
        return "Nome: " + nome + "\nAutor: " + autor + "\nPreco: " + precoBase + "\nIdentificador: " + id;
    }
    
    

}
