package Exames.a22_23;

public abstract class CampingSpace {
    private String localizacao;
    private int[] dimensoes;
    private double precoDia;

    public CampingSpace(String localizacao, int[] dimensoes, double precoDia) {
        this.localizacao = localizacao;
        this.dimensoes = dimensoes;
        this.precoDia = precoDia;

    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int[] getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(int[] dimensoes) {
        this.dimensoes = dimensoes;
    }

    public double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(double precoDia) {
        this.precoDia = precoDia;
    }

    abstract SpaceType getType();
    
}
