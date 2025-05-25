package EstudoCasa.aula8.Ex3;

public class ProdutoGenerico implements Produto{
    private String nome;
    private int stock;
    private double preco;

    public ProdutoGenerico(String nome, int stock, double preco) {
        this.nome = nome;
        this.stock = stock;
        this.preco = preco;
    }
    public void adicionarQuantidade(int quantidade){
        stock += quantidade;
    }
    public void removerQuantidade(int quantidade){
        stock -= quantidade;
    }
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return stock;
    }
    public double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return "ProdutoGenerico [nome=" + nome + ", stock=" + stock + ", preco=" + preco + "]";
    }

    
}
