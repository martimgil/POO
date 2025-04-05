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

    public void listarVeiculos(){
        for(Veiculo veiculo: veiculos){
            System.out.println(veiculo.toString());
        }
    }

    public Veiculo maisQuilometros(){
        int valor = 0;
        Veiculo maior = null; 
        for(Veiculo veiculo: veiculos){
            int distancia = veiculo.distanciaTotal();

            if (distancia > valor){
                valor = distancia;
                maior = veiculo;
            }
        }

        return maior;
    }


    public Veiculo menosQuilometros(){
        int valor = veiculos.get(0).distanciaTotal();
        Veiculo menor = null;

        for(Veiculo veiculo: veiculos){
            int distancia = veiculo.distanciaTotal();
            if(distancia<valor){
                valor = distancia;
                menor = veiculo;

            }
        }

        return menor;
    }

}
