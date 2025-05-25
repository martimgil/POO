package EstudoCasa.aula8.Ex3;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ProdutoGenerico p1 = new ProdutoGenerico("Camisolas", 10, 3);
        ProdutoGenerico p2 = new ProdutoGenerico("Calças", 30, 1);
        ProdutoGenerico p3 = new ProdutoComDesconto("Sapatilhas", 50, 2, 50);
        ProdutoGenerico p4 = new ProdutoComDesconto("Casacos", 100, 1, 10);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(p1, 1);
        carrinho.adicionarProduto(p2, 5);
        carrinho.adicionarProduto(p3, 2);
        carrinho.adicionarProduto(p4, 1);

        carrinho.listarProdutos();
        System.out.printf("Preço total da compra %.2f\n", carrinho.calcularTotal());
    }
}
