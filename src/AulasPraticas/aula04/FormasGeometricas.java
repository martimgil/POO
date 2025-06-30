package aula04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FormasGeometricas {
    public static void main(String[] args) {
        List<Object> figuras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Criar círculo");
            System.out.println("2 - Criar triangulo");
            System.out.println("3 - Criar retangulo");
            System.out.println("4 - Listar figuras");
            System.out.println("5 - Comparar figuras");
            System.out.println("6 - Sair");

            System.out.print("Escolha opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira raio: ");
                    double raio = sc.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    figuras.add(circulo);
                    System.out.println("Círculo criado com raio: " + circulo.getRaio());
                    System.out.println("Área: " + circulo.areaCirculo(circulo.getRaio()));
                    System.out.println("Perímetro: " + circulo.perimetroCirculo(circulo.getRaio()));
                    break;
                case 2:
                    System.out.print("Lado 1: ");
                    double lado1 = sc.nextDouble();
                    System.out.print("Lado 2: ");
                    double lado2 = sc.nextDouble();
                    System.out.print("Lado 3: ");
                    double lado3 = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
                    figuras.add(triangulo);
                    System.out.println("Triângulo criado com lados: " + triangulo.getLado1() + ", " + triangulo.getLado2() + ", " + triangulo.getLado3());
                    System.out.println("Área: " + triangulo.areaTriangulo(lado1, lado2, lado3));
                    System.out.println("Perímetro: " + triangulo.perimetroTriangulo(lado1, lado2, lado3));
                    break;
                case 3:
                    System.out.print("Comprimento: ");
                    double comprimento = sc.nextDouble();
                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();
                    Retangulo retangulo = new Retangulo(comprimento, altura);
                    figuras.add(retangulo);
                    System.out.println("Retângulo criado com comprimento: " + retangulo.getComprimento() + " e altura: " + retangulo.getAltura());
                    System.out.println("Área: " + retangulo.areaRetangulo(comprimento, altura));
                    System.out.println("Perímetro: " + retangulo.perimetroRetangulo(comprimento, altura));
                    break;
                case 4:
                    System.out.println("Figuras criadas: ");
                    for (Object figura : figuras) {
                        System.out.println(figura.toString());
                    }
                    break;
                case 5:
                    System.out.println("Comparar figuras do mesmo tipo");
                    for (int i = 0; i < figuras.size(); i++) {
                        for (int j = i + 1; j < figuras.size(); j++) {
                            if (figuras.get(i).getClass() == figuras.get(j).getClass()) {
                                System.out.println(figuras.get(i).equals(figuras.get(j)));
                            }
                        }
                    }
                case 6:
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}