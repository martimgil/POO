package aula07;
public class TesteFormas {
    public static void main(String[] args) {
        Forma c1 = new Circulo("vermelho", 5);
        Forma r1 = new Retangulo("azul", 4, 6);
        Forma t1 = new Triangulo("verde", 3, 4, 5);
        
        System.out.println("Círculo - Cor: " + c1.getCor() + ", Área: " + c1.calcularArea() + ", Perímetro: " + c1.calcularPerimetro());
        System.out.println("Retângulo - Cor: " + r1.getCor() + ", Área: " + r1.calcularArea() + ", Perímetro: " + r1.calcularPerimetro());
        System.out.println("Triângulo - Cor: " + t1.getCor() + ", Área: " + t1.calcularArea() + ", Perímetro: " + t1.calcularPerimetro());
    }
}
