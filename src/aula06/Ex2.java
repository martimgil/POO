package aula06;

import java.util.HashSet;
import java.util.Scanner;

public class Ex2 {
        Scanner sc = new Scanner(System.in);
        private static HashSet<Contacto> contactos = new HashSet<>();

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Inserir contacto");
            System.out.println("2. Alterar contacto");
            System.out.println("3. Apagar contacto");
            System.out.println("4. Procurar contacto");
            System.out.println("5. Listar contactos");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Insira o nome: ");
                    String nome = sc.next();
                    System.out.print("Insira o CC: ");
                    int CC = sc.nextInt();
                    System.out.print("Insira data de nascimento (YYYY-MM-DD): ");
                    String dataInput = sc.next();
                    String[] dataInputSplit = dataInput.split("-");
                    int day = Integer.parseInt(dataInputSplit[2]);
                    int month = Integer.parseInt(dataInputSplit[1]);
                    int year = Integer.parseInt(dataInputSplit[0]);
                    DateYMD dataNasc = new DateYMD(day, month, year);
                    System.out.print("Insira e-mail: ");
                    String email = sc.next();
                    System.out.print("Insira n.º telemovel:");
                    int ntelemovel = sc.nextInt();
                    contactos.add(new Contacto(nome, CC, dataNasc, ntelemovel, email));
                    break;

                case 2:
                    System.out.println("Pesquisar por número ou nome");
                    String search = sc.next();
                    for(Contacto contacto: contactos){
                        if(search.equals(contacto.getName()) || (Integer.parseInt(search) == contacto.getId())){
                            
                        }

                    }


                case 3:




                case 4:



                case 5:

                default:
                    }
                }
            }