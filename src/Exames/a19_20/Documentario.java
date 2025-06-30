package Exames.a19_20;

public class Documentario {
    private String titulo;
    private int ano;
    private int duracao;

    public Documentario(String titulo, int ano, int duracao) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + "Documentario [titulo=" + titulo + ", ano=" + ano + ", duracao=" + duracao + "]";
    }    
    
    
    
}
