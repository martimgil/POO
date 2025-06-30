package Exames.a19_20;

public class Electrodomestico extends Produto{
    private String tipo;
    private String marca;
    private String modelo;
    private ClasseEnergetica classe;
    private double potencia;
    private double iva = 1.23;
    
    public Electrodomestico(String codigo, int quantidade, double precoBase, String tipo, String marca, String modelo,
            ClasseEnergetica classe, double potencia) {
        super(codigo, quantidade, precoBase);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.classe = classe;
        this.potencia = potencia;
    }

    public Electrodomestico(String tipo, String marca, String modelo, double potencia, double precoBase){
        super("E", 0, precoBase);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;

    }

    public Electrodomestico(String tipo, String marca, String modelo, double precoBase){
        super("E",0, precoBase );
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ClasseEnergetica getClasse() {
        return classe;
    }

    public void setClasse(ClasseEnergetica classe) {
        this.classe = classe;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getDescricao(){
        return  tipo + ":"  + marca + "/" + modelo;
    }

    @Override
    public String toString() {
        return super.toString() +"Electrodomestico [tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", classe=" + classe
                + ", potencia=" + potencia + "]";
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Electrodomestico other = (Electrodomestico) obj;
        return tipo.equals(other.tipo) &&
               marca.equals(other.marca) &&
               modelo.equals(other.modelo);
    }

    @Override
    public int hashCode() {
        int result = tipo != null ? tipo.hashCode() : 0;
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        return result;
    }

    public double precoVendaAoPublico(){
        return getPrecoBase() * iva;
    }

    
    
}
