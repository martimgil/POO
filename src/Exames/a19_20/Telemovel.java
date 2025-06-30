package Exames.a19_20;

import java.util.HashSet;

public class Telemovel extends Produto{
    private String marca;
    private String modelo;
    private HashSet<String> notas;
    private double iva = 1.23;

    
    public Telemovel(String codigo, int quantidade, double precoBase, String marca, String modelo,
            HashSet<String> notas) {
        super(codigo, quantidade, precoBase);
        this.marca = marca;
        this.modelo = modelo;
        this.notas = notas;
    }

    public Telemovel(String marca, String modelo, double precoBase){
        super("T", 0, precoBase);
        this.marca = marca;
        this.modelo = modelo;
        this.notas = new HashSet<>();

    }

    public void addNota(String a){
        notas.add(a);
    }

    @Override
    public String toString() {
        return super.toString() + "Telemovel [marca=" + marca + ", modelo=" + modelo + ", notas=" + notas + "]";
    }

     public String getDescricao(){
        return  marca + "/" + modelo;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Telemovel)) return false;
        Telemovel other = (Telemovel) obj;
        return this.marca.equalsIgnoreCase(other.marca) &&
               this.modelo.equalsIgnoreCase(other.modelo);
    }

    @Override
    public int hashCode() {
        return (marca.toUpperCase() + "/" + modelo.toUpperCase()).hashCode();
    }

    
    public double precoVendaAoPublico(){
        return getPrecoBase() * iva;
    }

    
}
