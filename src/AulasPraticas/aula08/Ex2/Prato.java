package aula08.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.lang.Comparable;

public class Prato implements Comparable<Prato> {

    private String nome;
    private List<Alimento> listaAlimentos;

    public enum DiaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
    }

    public boolean addIngrediente(Alimento aux){
        return listaAlimentos.add(aux);
    }

    public Prato(String nome) {
        this.nome = nome;
        listaAlimentos = new ArrayList<>();
    }

    public int pesoTotal() {
        int peso = 0;

        for (Alimento alimento : listaAlimentos) {
            peso += alimento.getPeso();
        }
        return peso;
    }

    public int proteinas() {
        int prot = 0;
        for (Alimento alimento : listaAlimentos) {
            prot += (alimento.getProteinas() * alimento.getPeso() / 100);
        }
        return prot;
    }

    public int calorias() {
        int cal = 0;

        for (Alimento alimento : listaAlimentos) {
            cal += (alimento.getCalorias() * alimento.getPeso() / 100);
        }

        return cal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((listaAlimentos == null) ? 0 : listaAlimentos.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Prato other = (Prato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (listaAlimentos == null) {
            if (other.listaAlimentos != null)
                return false;
        } else if (!listaAlimentos.equals(other.listaAlimentos))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Prato [nome=" + nome + ", listaAlimentos=" + listaAlimentos + "]";
    }

    @Override
    public int compareTo(Prato outroPrato) {
        return Integer.compare(this.calorias(), outroPrato.calorias());
    }

}
