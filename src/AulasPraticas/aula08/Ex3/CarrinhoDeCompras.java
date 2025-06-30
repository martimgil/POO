package aula08.Ex3;

import java.util.ArrayList;

public class CarrinhoDeCompras  implements Compra{
    private ArrayList<Produto> carrinho;

    public CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
    }


    @Override
    public void adicionarProduto(Produto produto, int quantidade){
        for(int i=0; i<quantidade;i++){
            carrinho.add(produto);
        }
    }

    @Override
    public void listarProdutos(){
        for(Produto produto: carrinho){
            System.out.println(produto.toString());
        }
    }

    public double calcularTotal(){
        double total = 0;

        for(Produto produto: carrinho){
            total+=produto.getPreco();
        }
        return total;
    }

}
