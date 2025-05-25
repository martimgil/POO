package EstudoCasa.aula8.Ex3;

public class ProdutoComDesconto extends ProdutoGenerico{
    private int desconto;

    public ProdutoComDesconto(String nome, int stock, double preco, int desconto) {
        super(nome, stock, preco);
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "ProdutoComDesconto [nome=" + super.getNome() + ",stock=" + super.getQuantidade()+", preco=" + super.getPreco() + ", desconto=" + desconto + "]";
    }

    public int getDesconto() {
        return desconto;
    }

    
    
}
