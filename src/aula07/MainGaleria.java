package aula07;

import java.util.HashMap;
import java.util.Scanner;

public class MainGaleria {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Galeria galeria = new Galeria();
        int opcao = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar uma obra");
            System.out.println("2. Listar obras");
            System.out.println("3. Vender uma obra");
            System.out.println("4. Calcular o lucro total");
            System.out.println("5. Sair");
            System.out.print("Opçao: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\n1. Adicionar uma obra do tipo");
                    System.out.println("1. Quadro");
                    System.out.println("2. Escultura");
                    System.out.println("3. Obra Digital (NFT)");
                    System.out.print("Tipo de produto: ");
                    int opcaoProduto = sc.nextInt();
                    sc.nextLine();
                    switch (opcaoProduto) {
                        case 1:
                            //Adicionar um Quadro
                            System.out.print("Nome do Quadro:");
                            String nome = sc.nextLine();
                            System.out.print("Autor do Quadro:");
                            String autor = sc.nextLine();
                            System.out.print("Preço do Quadro: ");
                            int precoBase = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Tipo de Tinta: ");
                            String colorType = sc.nextLine();
                            System.out.print("Obra emoldurada (s/n): ");
                            String emolduradaV = sc.nextLine();
                            boolean emoldurada;

                            if (emolduradaV.equals("s")){
                                emoldurada = true;
                            } else{
                                emoldurada = false;
                            }
                            System.out.print("Tamanho da Tela: ");
                            String size = sc.nextLine();
                            galeria.newObra(new Quadro(nome, autor, precoBase, colorType, emoldurada, size));
                            break;
                        case 2:
                            // Adicionar uma Escultura
                            System.out.print("Nome da Escultura:");
                            String nomeE = sc.nextLine();
                            System.out.print("Autor da Escultura:");
                            String autorE = sc.nextLine();
                            System.out.print("Preço da Escultura: ");
                            int precoBaseE = sc.nextInt();
                            System.out.print("Material: ");
                            String material = sc.nextLine();
                            sc.nextLine();
                            System.out.print("Quanto exemplares foram produzidos: ");
                            int numbers = sc.nextInt();
                            galeria.newObra(new Escultura(nomeE, autorE, precoBaseE, material, numbers));
                            break;
                        case 3:
                            // Adicionar uma ObraDigital (i.e., NFT)
                            System.out.print("Nome do NFT: ");
                            String nomeN = sc.nextLine();
                            System.out.print("Autor do NFT: ");
                            String autorN = sc.nextLine();
                            System.out.print("Preço do NFT: ");
                            int precoBaseN = sc.nextInt();
                            System.out.print("Nome da Blockchain: ");
                            String nomeBlockchain = sc.nextLine();
                            sc.nextLine();

                            System.out.print("Endereço do contrato: ");
                            String endereco = sc.nextLine();
                            galeria.newObra(new ObraDigital(nomeN, autorN, precoBaseN, nomeBlockchain, endereco));
                            break;
                    }
                    break;
                case 2:
                    // Listar as obras
                    System.out.println("Obras disponiveis: ");
                    HashMap<Integer, Obra> obras = galeria.getObras();
                    for (Obra obra : obras.values()) {
                        System.out.println(obra.getClass().getSimpleName() + " " + obra.toString());
                    }
                    break;
                case 3:
                    // Vender uma obra
                    System.out.print("Identificador da obra: ");
                    int id = sc.nextInt();
                    System.out.print("Preço de venda: ");
                    int preco = sc.nextInt();
                    Obra obra = galeria.searchObra(id);
                    galeria.sellObra(id, preco);
                    System.out.println("Obra vendida: " + obra.getNome()+ " por " + preco + " Euros" );
                    break;
                case 4:
                    // Apresentar o lucro total
                    System.out.println("Lucro total: " + galeria.getLucro());
                    break;
                case 5:
                    System.out.println("5. Sair");
                    sc.close();
                    break;
            }
        } while (opcao != 5);
    }

}