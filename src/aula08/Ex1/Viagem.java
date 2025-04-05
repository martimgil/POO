package aula08.Ex1;

import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        int opcao=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome da empresa: ");
        String nome = sc.nextLine();
        System.out.print("Código Postal: ");
        String codigoPostal = sc.nextLine();
        System.out.print("E-mail");
        String email = sc.nextLine();
        Empresa empresa = new Empresa(nome, codigoPostal,  email);
        Veiculo moto = new Motociclo("AA-00-AA", "Ducati", "123", 1000, "desportiva");
        Veiculo taxi = new Taxi("BB-00-BB", "Dacia", 1000, 200000, 500, 2929);
        Veiculo caminhao = new PesadoMercadorias("IJ-56-KL", "Volvo", "Scania", 550,"789",  40000, 4);

        moto.trajeto(15000);
        taxi.trajeto(22000);
        caminhao.trajeto(50000);

        empresa.adicionarViatura(moto);
        empresa.adicionarViatura(taxi);
        empresa.adicionarViatura(caminhao);
        
    }
    
}
