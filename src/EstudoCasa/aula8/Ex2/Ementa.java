package EstudoCasa.aula8.Ex2;

import java.util.HashMap;

public class Ementa {
    private String nome;
    private String local;
    private HashMap<DiaSemana,Prato> pratos;

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.pratos = new HashMap<>();
    }

    public enum DiaSemana{
        DOMINGO, SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO;
    }
    
    public enum VariedadeCarne{
        VACA, PORCO, FRANGO, PERU, OUTRA
    }

    public enum TipoPeixe{
        CONGELADO, FRESCO
    }

    public void addPrato(Prato prato, DiaSemana dia){
        pratos.put(dia, prato);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((local == null) ? 0 : local.hashCode());
        result = prime * result + ((pratos == null) ? 0 : pratos.hashCode());
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
        Ementa other = (Ementa) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        if (pratos == null) {
            if (other.pratos != null)
                return false;
        } else if (!pratos.equals(other.pratos))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Ementa [nome=" + nome + ", local=" + local + ", pratos=" + pratos + "]";
    }

    
    
    
}
