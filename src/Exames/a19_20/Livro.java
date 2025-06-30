package Exames.a19_20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Livro extends Produto {
    String titulo;
    List <Autor> listdeAutores = new ArrayList<>();
    double iva = 1.06;

    public Livro(String titulo, List<Autor> ListdeAutores) {
        super("L", 0, 0);
        this.titulo = titulo;
        this.listdeAutores = ListdeAutores;
    }

    public Livro(String titulo, double precobase) {
        super("L", 0, precobase);
        this.titulo = titulo;
    }

    public Livro(String titulo, double precobase,List<Autor> ListdeAutores) {
        super("L", 0, precobase);
        this.titulo = titulo;
        this.listdeAutores = ListdeAutores;
    }

    public void add(Autor a){
        listdeAutores.add(a);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getLista() {
        return listdeAutores;
    }

    public void setListdeAutores(List<Autor> listdeAutores) {
        this.listdeAutores = listdeAutores;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int numeroAutores(){
        return listdeAutores.size();
    }

    public String autores(){
        String s = "";
        for(Autor a: listdeAutores){
            s+= a.getNome() + " ";
        }
        return s;
    }

    @Override
    public String toString() {
        return super.toString() + "Livro [titulo=" + titulo + ", listdeAutores=" + listdeAutores + ", iva=" + iva + "]";
    }


    
    public double precoVendaAoPublico(){
        return getPrecoBase() * iva;
    }




}
    

