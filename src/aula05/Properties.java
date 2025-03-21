package aula05;

class Properties {
    int id;
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
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.disponibilidade = false;
    }

    @Override
    public String toString() {
        String disponibilidadeStr = disponibilidade ? "sim" : "não";
        if (dataInicio == null || dataFim == null) {
            return "Imóvel: " + id + "; quartos: " + quartos + "; localidade: " + localidade + "; preço: " + preco
                    + "; disponível: " + disponibilidadeStr;
        } else {
            return "Imóvel: " + id + "; quartos: " + quartos + "; localidade: " + localidade + "; preço: " + preco
                    + "; disponível: " + disponibilidadeStr + "; leilão " + dataInicio + " : " + dataFim;
        }
    }
}