package aula06;

public class Bolseiro extends Aluno {
    private Professor orientador;
    private int montanteMensal;

    public Bolseiro(String nome, int cc, DateYMD dataNasc, DateYMD dataInscricao, Professor orientador,
            int montanteMensal) {
        super(nome, cc, dataNasc, dataInscricao);
        this.orientador = orientador;
        this.montanteMensal = montanteMensal;
    }

    public Bolseiro(String nome, int cc, DateYMD dataNasc, Professor orientador, int montanteMensal) {
        super(nome, cc, dataNasc);
        this.orientador = orientador;
        this.montanteMensal = montanteMensal;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public int getBolsa() {
        return montanteMensal;
    }

    public void setBolsa(int montanteMensal) {
        this.montanteMensal = montanteMensal;
    }

    @Override
    public String toString() {
        return super.toString() + "; Bolsa: " + montanteMensal + "; Orientador: " + orientador.getName();
    }
}