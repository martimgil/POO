package EstudoCasa.aula8.Ex2;

import java.util.ArrayList;

public class Prato implements java.lang.Comparable<Prato> {
    private ArrayList<Alimento> conjunto;
    private String nome;

    public Prato( String nome) {
        this.conjunto = new ArrayList<>();
        this.nome = nome;

    }

    @Override
    public int compareTo(Prato other) {
        return Double.compare(this.getCaloriasTotal(), other.getCaloriasTotal());
    }

    public boolean addIngrediente(Alimento alimento){
        conjunto.add(alimento);

        return true;
    }

    public double getPesoTotal(){
        double pesoTotal = 0;

        for(Alimento alimento: conjunto){
            pesoTotal += alimento.getPeso();
        }
        return pesoTotal;
    }

    public double getCaloriasTotal(){
        double caloriasTotal = 0;
        for(Alimento alimento: conjunto){
            caloriasTotal += alimento.getCalorias();
        }
        return caloriasTotal;
    }

    public double getProteinasTotal(){
        double proteinasTotal = 0;
        for(Alimento alimento: conjunto){
            proteinasTotal += alimento.getProteinas();
        }
        return proteinasTotal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((conjunto == null) ? 0 : conjunto.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        if (conjunto == null) {
            if (other.conjunto != null)
                return false;
        } else if (!conjunto.equals(other.conjunto))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Prato [conjunto=" + conjunto + ", nome=" + nome + "]";
    }
}
