package Exames.a22_23;

public class Client {
    private int numeroContribuinte;
    private String nome;
    private ClientType tipo;

    public Client(int numeroContribuinte, String nome, ClientType tipo) {
        this.numeroContribuinte = numeroContribuinte;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getNumeroContribuinte() {
        return numeroContribuinte;
    }

    public void setNumeroContribuinte(int numeroContribuinte) {
        this.numeroContribuinte = numeroContribuinte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClientType getTipo() {
        return tipo;
    }

    public void setTipo(ClientType tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numeroContribuinte;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        Client other = (Client) obj;
        if (numeroContribuinte != other.numeroContribuinte)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (tipo != other.tipo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return numeroContribuinte + " " + nome + " " + tipo;
    }

    

    
    
}

