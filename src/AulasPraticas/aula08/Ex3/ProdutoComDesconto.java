package aula08.Ex3;

public class ProdutoComDesconto extends ProdutoGenerico{
    private double desconto;

    public ProdutoComDesconto(String nome, int stock, double preco, double desconto) {
        super(nome, stock, preco);
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "ProdutoComDesconto [desconto=" + desconto + "]" + super.toString();
    }

    
}
