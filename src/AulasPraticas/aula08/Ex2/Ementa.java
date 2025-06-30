package aula08.Ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ementa {
    private Map<DiaSemana, ArrayList<Prato>> ementa;
    private String nome;
    private String local;

    public enum DiaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
    }

    public Ementa(String nome, String local) {
        ementa = new HashMap<>();
        for (DiaSemana dia : DiaSemana.values()) {
            ementa.put(dia, new ArrayList<>());
        }
        this.nome = nome;
        this.local = local;
    }


    public enum VariedadeCarne {
        FRANGO, PERU, PORCO, VACA
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ementa == null) ? 0 : ementa.hashCode());
        return result;
    }
    
    public void addPrato(Prato prato, DiaSemana dia) {
        ementa.get(dia).add(prato); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ementa other = (Ementa) obj;
        if (ementa == null) {
            if (other.ementa != null)
                return false;
        } else if (!ementa.equals(other.ementa))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ementa [ementa=" + ementa + "]";
    }




    
}
