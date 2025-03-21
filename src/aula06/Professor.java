package aula06;

public class Professor extends Pessoa{
    private String categoria;
    private String departamento;

    public Professor(String nome, int CC, DateYMD dataNasc, String categoria, String departamento) {
        super(nome, CC, dataNasc);
        this.categoria = categoria;
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Professor " + categoria + ", departamento:" + departamento + ";";
    }
}
