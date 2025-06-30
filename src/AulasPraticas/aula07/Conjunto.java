package aula07;
import java.util.HashMap;

public class Conjunto {
    //Irei usar um dicionario. As keys serão o número pretendido e o valor associado será a cardinalidade desse número.
    private HashMap<Integer, Integer> conjunto = new HashMap<>();

    public void insert(int n) {
        if (conjunto.containsKey(n)) {
            int v = conjunto.get(n);
            v++;
            conjunto.put(n, v);
        } else {
            conjunto.put(n, 1);
        }
    }

    public boolean contains(int n) {
        return conjunto.containsKey(n);
    }

    public void remove(int n) {
        if (conjunto.containsKey(n) && conjunto.get(n) > 1) {
            int v = conjunto.get(n);
            v--;
            conjunto.put(n, v);
        } else if (conjunto.containsKey(n) && conjunto.get(n) == 1) {
            conjunto.remove(n);
        }
    }

    public void empty() {
        conjunto.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (var entry : conjunto.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey()).append(", ");
            }
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2); 
        }
        sb.append("]");
        return sb.toString();
    }

    public int size() {
        int nelementos = 0;

        for (int valor : conjunto.values()) {
            nelementos += valor;
        }

        return nelementos;
    }

    public Conjunto combine(Conjunto add) {
        Conjunto resultado = new Conjunto();
    
        for (int n : conjunto.keySet()) {
            for (int i = 0; i < conjunto.get(n); i++) {
                resultado.insert(n);
            }
        }
    
        for (int n : add.getConjunto().keySet()) {
            for (int i = 0; i < add.getConjunto().get(n); i++) {
                resultado.insert(n);
            }
        }
    
        return resultado;
    }

    public Conjunto subtract(Conjunto dif){
        Conjunto resultado = new Conjunto();
    
        for (int n : conjunto.keySet()) {
            for (int i = 0; i < conjunto.get(n); i++) {
                resultado.insert(n);
            }
        }
    
        for (int n : dif.getConjunto().keySet()) {
            for (int i = 0; i < dif.getConjunto().get(n); i++) {
                resultado.remove(n);
            }
        }

        return resultado;
    }

    public HashMap<Integer, Integer> getConjunto() {
        return conjunto;
    }

    public Conjunto intersect (Conjunto inter){
        Conjunto resultado = new Conjunto();
    
        for (int n : conjunto.keySet()) {
            if(inter.getConjunto().containsKey(n)){
                int v1 = conjunto.get(n);
                int v2 = inter.getConjunto().get(n);

                if(v1<v2){
                    for(int i=0; i<v1; i++){
                        resultado.insert(n);
                    }
                } else{
                    for(int i=0; i<v2; i++){
                        resultado.insert(n);
                    }
                }
            }
        }

        return resultado;
    }

    
}
