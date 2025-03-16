package aula05;

class Properties {
    int id = 1000;
    int quartos;
    String localidade;
    int preco;
    boolean disponibilidade;


    DateYMD dataInicio;
    DateYMD dataFim;

    private static int contadorId = 1000;

    public Properties(int quartos, String localidade, int preco) {
        this.id = contadorId++;
        this.quartos = quartos;
        this.localidade = localidade;
        this.preco = preco;
        this.disponibilidade = true;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return disponibilidade;
    }

    public void sell() {
        this.disponibilidade = false;
    }

    public void setAuction(DateYMD dataInicio, DateYMD dataFim) {
        if (dataInicio == null || dataFim == null) {
            throw new IllegalArgumentException("As datas de início e fim não podem ser nulas.");
        }
        this.dataInicio = new DateYMD(dataInicio.getDay(), dataInicio.getMonth(), dataInicio.getYear());
        this.dataFim = new DateYMD(dataFim.getDay(), dataFim.getMonth(), dataFim.getYear());
        this.disponibilidade = false; 
    }
    @Override
    public String toString() {
        if (dataInicio == null || dataFim == null) {
            return "Imóvel: " + id + "; quartos: " + quartos + "; localidade: " + localidade + "; preco: " + preco
                    + ", disponível: " + disponibilidade;
        } else {
            return "Imóvel: " + id + "; quartos: " + quartos + "; localidade: " + localidade + "; preco: " + preco
                    + ", disponível: " + disponibilidade + "; leilão  " + dataInicio.toString() + " : " + dataFim.toString();
        }
    }

}
  