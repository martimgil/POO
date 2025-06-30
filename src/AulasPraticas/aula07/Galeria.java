package aula07;

import java.util.HashMap;

public class Galeria {
    private HashMap<Integer, Obra> obras  = new HashMap<>();
    private int lucro = 0; 

    public void newObra(Obra obra){
        int id = obra.getId();
        obras.put(id,obra);
    }

    public HashMap<Integer, Obra> getObras() {
        return obras;
    }

    public  void sellObra(int id, int preco){
        lucro += preco;
        obras.remove(id);

    }

    public Obra searchObra(int id){
        return obras.get(id);
    }

    public int getLucro() {
        return lucro;
    }



}
