package aula06;

import java.util.HashSet;

public class Conjunto {
    private HashSet<Integer> conjunto = new HashSet<>();
    
    public void insert(int n){
        conjunto.add(n);
    }

    public boolean contains(int n){
        return conjunto.contains(n);
    }

    public void remove(int n){
        conjunto.remove(n);
    }

    public void empty(){
        conjunto.clear();
    }

    @Override
    public String toString(){
        return conjunto.toString();
    }

    public int size(){
        return conjunto.size();
    }

    public Conjunto combine(Conjunto add) {
        Conjunto resultado = new Conjunto();
        resultado.conjunto.addAll(this.conjunto);
        resultado.conjunto.addAll(add.conjunto);
        return resultado;
    }

    public Conjunto subtract(Conjunto dif) {
        Conjunto resultado = new Conjunto();
        resultado.conjunto.addAll(this.conjunto);
        resultado.conjunto.removeAll(dif.conjunto);
        return resultado;
    }

    public Conjunto intersect(Conjunto inter) {
        Conjunto resultado = new Conjunto();
        for (int num : this.conjunto) {
            if (inter.conjunto.contains(num)) {
                resultado.insert(num);
            }
        }
        return resultado;
    }
}