package aula08.Ex3;

public class ProdutoGenerico implements Produto {
    private String nome;
    private int stock = 0;
    private double preco;


    public ProdutoGenerico(String nome, int stock, double preco) {
        this.nome = nome;
        this.stock = stock;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getQuantidade() {
        return stock;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void adicionarQuantidade(int quantidade){
        stock+=quantidade;
    }

    @Override
    public void removerQuantidade(int quantidade){
        if(quantidade<=stock){
            stock-=quantidade;
        }
    }

    @Override
    public String toString() {
        return "ProdutoGenerico [nome=" + nome + ", stock=" + stock + ", preco=" + preco + "]";
    }
    
}
