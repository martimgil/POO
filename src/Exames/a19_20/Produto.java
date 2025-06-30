package Exames.a19_20;


public abstract class Produto implements PVP{
    private String codigo;
    private int quantidade;
    private double precoBase;

    public Produto(String codigo, int quantidade, double precobase) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoBase = precobase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return quantidade;
    }

    public void setStock(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void addStock(int q){
        quantidade+=q;
    }

    public boolean vender(int q){
        if(q>quantidade){
            return false;
        }
        quantidade -= q;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", quantidade=" + quantidade + ", precoBase=" + precoBase + "]";
    }


    public abstract Produto 
    
    
}
