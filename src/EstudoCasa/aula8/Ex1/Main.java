package EstudoCasa.aula8.Ex1;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Aluguer UA", "3810-193", "contacto@ua.pt");

        Veiculo moto = new Motociclo("AA-00-AA", "Ducati", "Monster", 150, "desportivo");
        Veiculo taxi = new Taxi("BB-00-BB", "Toyota", "Prius", 120, 12345, 500, 2929);
        Veiculo caminhao = new PesadoMercadorias("CC-00-CC", "Volvo", "FH16", 540, "789", 40000, 20000);
        Veiculo autocarro = new PesadoPassageiros("DD-00-DD", "Mercedes", "Tourismo", 450, "456", 18000, 50);
        Eletrico carroEletrico = new Eletrico("EE-00-EE", "Tesla", "Model 3", 300, 98765, 425, 50, 100);
        Telemovel telemovel = new Telemovel("912345678", 100);

        empresa.adicionarViatura(moto);
        empresa.adicionarViatura(taxi);
        empresa.adicionarViatura(caminhao);
        empresa.adicionarViatura(autocarro);
        empresa.adicionarViatura(carroEletrico);

        Atleta atleta = new Atleta();

        // Registrar treinos do atleta
        atleta.trajeto(10);
        atleta.trajeto(15);
        System.out.println("Atleta - Último trajeto: " + atleta.ultimoTrajeto() + " km");
        System.out.println("Atleta - Distância total: " + atleta.distanciaTotal() + " km");

        System.out.println("Carro Elétrico - Carga disponível: " + carroEletrico.cargaDisponivel() + "%");
        System.out.println("Telemóvel - Carga disponível: " + telemovel.cargaDisponivel() + "%");

        carroEletrico.limitarCargaMaxima(80);
        telemovel.limitarCargaMaxima(80);
        if (carroEletrico.cargaDisponivel() < 40) {
            carroEletrico.carregar(40);
        }
        if (telemovel.cargaDisponivel() < 40) {
            telemovel.carregar(40);
        }

        System.out.println("Carro Elétrico - Carga após operações: " + carroEletrico.cargaDisponivel() + "%");
        System.out.println("Telemóvel - Carga após operações: " + telemovel.cargaDisponivel() + "%");
    }
}