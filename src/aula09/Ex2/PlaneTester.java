package aula09.Ex2;

import java.util.Scanner;

public class PlaneTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlaneManager frota = new PlaneManager(); 
        while (true) {
            System.out.print("1 - Adicionar aviões");
            System.out.println("2 - Remover aviões da frota");
            System.out.println("3 - Procurar um avião em especifico");
            System.out.println("4 - Imprimir a informação de todos os aviões da frota");
            System.out.println("5 - Imprimir a lista de todos os aviões comerciais ou a lista de todos os aviões militares.");
            System.out.println("6 - Imprimir as informações do avião mais rápido da frota.");
            System.out.print("Opção: ");
            int op1 = sc.nextInt();

                        switch (op1) {
                            case 1:
                                System.out.println("1 - Adicionar avião comercial");
                                System.out.println("2 - Adicionar avião militar");
                                System.out.print("Opção: ");
                                int op2 = sc.nextInt();
                                sc.nextLine(); // consumir newline
                                String identificadorUnico;
                                String fabricante;
                                String modelo;
                                int anoProducao;
                                int numeroMaximoPassageiros;
                                int velocidadeMaxima;
            
                                switch (op2) {
                                    case 1:
                                        System.out.print("Identificador Único: ");
                                        identificadorUnico = sc.nextLine();
                                        System.out.print("Fabricante: ");
                                        fabricante = sc.nextLine();
                                        System.out.print("Modelo: ");
                                        modelo = sc.nextLine();
                                        System.out.print("Ano de Produção: ");
                                        anoProducao = sc.nextInt();
                                        System.out.print("Número máximo de passageiros: ");
                                        numeroMaximoPassageiros = sc.nextInt();
                                        System.out.print("Velocidade máxima: ");
                                        velocidadeMaxima = sc.nextInt();
                                        System.out.print("Número de Tripulantes: ");
                                        int numeroTripulantes = sc.nextInt();
                                        sc.nextLine(); // consumir newline
                                        Plane aviaoComercial = new CommercialPlane(identificadorUnico, fabricante, modelo, anoProducao, numeroMaximoPassageiros, velocidadeMaxima, numeroTripulantes);
                                        frota.addPlane(aviaoComercial); 
                                        break;
                                    case 2:
                                        System.out.print("Identificador Único: ");
                                        identificadorUnico = sc.nextLine();
                                        System.out.print("Fabricante: ");
                                        fabricante = sc.nextLine();
                                        System.out.print("Modelo: ");
                                        modelo = sc.nextLine();
                                        System.out.print("Ano de Produção: ");
                                        anoProducao = sc.nextInt();
                                        System.out.print("Número máximo de passageiros: ");
                                        numeroMaximoPassageiros = sc.nextInt();
                                        System.out.print("Velocidade máxima: ");
                                        velocidadeMaxima = sc.nextInt();
                                        System.out.print("Número máximo de munições: ");
                                        int numeroMunicoes = sc.nextInt();
                                        sc.nextLine(); // consumir newline
                                        Plane aviaoMilitar = new MilitaryPlane(identificadorUnico, fabricante, modelo, anoProducao, numeroMaximoPassageiros, velocidadeMaxima, numeroMunicoes);
                                        frota.addPlane(aviaoMilitar);
                                        break;
                                    default:
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println();
                                System.out.print("Identificador Único: ");
                                sc.nextLine(); // consumir newline
                                String idUnico = sc.nextLine();
                                frota.removePlane(idUnico);
                                break;
                            case 3:                     
                                System.out.println();
                                System.out.print("Identificador Único: ");
                                sc.nextLine(); // consumir newline
                                String id = sc.nextLine();
                                Plane a = frota.searchPlane(id);
                                if (a != null) {
                                    System.out.println(a.toString());
                                } else {
                                    System.out.println("Avião não encontrado.");
                                }
                                break;
                            case 4:
                                frota.printAllPlanes();
                                break;
                            case 5:                    
                                System.out.println("1 - Imprimir avião comercial");
                                System.out.println("2 - Imprimir avião militar");
                                System.out.print("Opção: ");
                                int op3 = sc.nextInt();
                                sc.nextLine(); // consumir newline
                                switch (op3) {
                                    case 1:
                                        frota.printCommercialPlanes();
                                        break;
                                    case 2:
                                        frota.printMilitaryPlanes();
                                        break;
                                    default:
                                        System.out.println("Opção inválida.");
                                        break;
                                }
                                break;
                            case 6:
                                Plane maisRapido = frota.getFastestPlane();
                                if (maisRapido != null) {
                                    System.out.println(maisRapido.toString());
                                } else {
                                    System.out.println("Não existem aviões na frota.");
                                }
                                break;
                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }
            }

        }
}
    
