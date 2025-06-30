package Exames.a19_20;

import java.util.ArrayList;
import java.util.TreeSet;

public class Loja {
    private String nome;
    private String web;
    private TreeSet<Produto> listaStock;

    
    public Loja(String nome, String enderecoweb) {
        this.nome = nome;
        this.web = enderecoweb;
        this.listaStock = new TreeSet<>( (p1, p2) -> p1.getCodigo().compareTo(p2.getCodigo()) );
    }

    public int totalItems(){
        int q = 0;
        for(Produto p: listaStock){
            int quantidade = p.getStock();
            q+=quantidade;
        }
        return q;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public TreeSet<Produto> getListaStock() {
        return listaStock;
    }

    public void setListaStock(TreeSet<Produto> listaStock) {
        this.listaStock = listaStock;
    }

    public void add(Produto p){
        listaStock.add(p);
    }

    public String reorder(int lim) {
        ArrayList<Produto> res = new ArrayList<>();
        for (Produto p : listaStock) {
            if (p.getStock() < lim) {
                res.add(p);
            }
        }
        String s="";
        for(Produto p1: res){
            s+= p1.toString();
        }

        return s;
    }

    public Produto getProdutoPelaDescricao(){

    }
    
}
