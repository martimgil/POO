package aula08.Ex1;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String codigoPostal;
    private String email;
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public Empresa(String nome, String codigoPostal, String email) {
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.veiculos = veiculos;
    }

    public void adicionarViatura (Veiculo veiculo){
        veiculos.add(veiculo);
    }
}
