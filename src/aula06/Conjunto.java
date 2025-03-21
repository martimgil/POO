package aula06;
import java.util.HashSet;

public class Conjunto {
    private HashSet<Integer> set = new HashSet<>();
    
    public void insert(int n) {
        set.add(n); 
    }

    public boolean contains(int n) {
        return set.contains(n);
    }

    public void remove(int n) {
        set.remove(n); 
    }

    public void empty(){
        set.clear();
    }

    @Override
    public String toString() {
        return set.toString();
    }

    public int size(){
        return set.size();
    }

    public Conjunto combine(Conjunto second){
        set.addAll(second.set);
        return this;
    }

    public Conjunto subtract(Conjunto second){
        set.removeAll(second.set);        
        return this;
    }

    public Conjunto intersect(Conjunto second){
        set.retainAll(second.set);
        return this;
    }
}

    
//O desafio é fazer isso mas que se podem repetir 