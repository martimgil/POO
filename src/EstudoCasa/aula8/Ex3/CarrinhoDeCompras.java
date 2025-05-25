package EstudoCasa.aula8.Ex3;

import java.util.HashMap;

public class CarrinhoDeCompras implements Compra {
    private HashMap<ProdutoGenerico, Integer> lista;

    public CarrinhoDeCompras() {
        this.lista = new HashMap<>();
    }

    public void adicionarProduto(ProdutoGenerico produto, int quantidade) {
        lista.put(produto, lista.getOrDefault(produto, 0) + quantidade);
    }

    public void listarProdutos() {
        for (ProdutoGenerico p : lista.keySet()) {
            int quantidade = lista.get(p);
            System.out.println(p.toString() + ", quantidade no carrinho=" + quantidade);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ProdutoGenerico p : lista.keySet()) {
            int quantidade = lista.get(p);
            double preco = p.getPreco();
            if (p instanceof ProdutoComDesconto) {
                int desconto = ((ProdutoComDesconto) p).getDesconto();
                preco = preco * (1 - desconto / 100.0);
            }
            total += (quantidade * preco);
        }
        return total;
    }
}