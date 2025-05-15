package EstudoMT1.aula07;

import java.util.HashMap;

public class Galeria {
    private HashMap<Integer, Obra> galeria;
    private double lucro = 0;

    public Galeria() {
        this.galeria = new HashMap<>();
    }


    public void adicionarObra(Obra obra){
        galeria.put(obra.getIdentificador(), obra);
    }


    public HashMap<Integer, Obra> getGaleria() {
        return galeria;
    }


    public void venderObra(int id, double preco){
        galeria.remove(id);
        lucro+=preco;
    }

    public Obra getItem(int id){
        return galeria.get(id);
    }


    public double getLucro() {
        return lucro;
    }


    
}
