package aula04;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms+=distance;
    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static boolean verificarDadosCarro(String dados) {
        Pattern padrao = Pattern.compile("^\\w+\\s+\\w+(\\s+\\w+)*\\s+\\d{4}\\s+\\d+$");
        Matcher matcher = padrao.matcher(dados);
        return matcher.matches();
        }

        static int registerCars(Car[] cars) {

        int num = 0;
        while(true){
        System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");

        String input = sc.nextLine();
        if (input.equals("")){
            break;
        } else {

            if(verificarDadosCarro(input)){
            String[] parts = input.split("\\s+", 4);
            String marca = parts[0];
            String modelo = input.substring(marca.length()).trim().split("\\d{4}")[0].trim();
            int ano = Integer.parseInt(parts[parts.length - 2]);
            int quilometragem = Integer.parseInt(parts[parts.length - 1]);
            cars[num++] = new Car(marca, modelo, ano, quilometragem);
            }
            
            else{
            System.out.println("Dados mal formatados. Tente novamente...");
            }
        }
        }
        return num;
        }

        static void registerTrips(Car[] cars, int numCars) {
        // TODO: pede dados das viagens ao utilizador e atualiza informação do carro
        // registo de viagens termina quando o utilizador inserir uma linha vazia 
        
        while(true){

        System.out.print("Registe uma viagem no formato \"carro:distância\": ");

        String viagem = sc.nextLine();


        if(viagem.equals("")){
            break;
        } else {
            String[] info = viagem.split(":");

            int carsIndex = Integer.parseInt(info[0]);
            int distancia = Integer.parseInt(info[1]);
            cars[carsIndex].drive(distancia);
            }
        }
    }

    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados: ");
        for (Car car : cars) {
            if (car != null) {
                System.out.printf("%s %s, %d, kms: %d\n", car.make, car.model, car.year, car.kms);
            }
        }
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
        }

        sc.close();


    }
}


