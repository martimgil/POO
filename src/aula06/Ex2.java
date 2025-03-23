package aula06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ex2 {
    private static HashSet<Contacto> contactos = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
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
                    novoContacto();
                    break;
                case 2:
                    alterarContacto();
                    break;
                case 3:
                    apagarContacto();
                    break;
                case 4:
                    procurarContacto();
                    break;

                case 5:
                    listarContacto();
                    break;
                
                case 0:
                    break;

            }
        }
        
    }


    public static void novoContacto(){
        Scanner sc = new Scanner(System.in);
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
        sc.close();
        }

    public static void alterarContacto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pesquisar por número ou nome");
        String search = sc.next();
        ArrayList<Contacto> resultados = new ArrayList<>();
        Contacto contactoSelecionado = null;
        
        for(Contacto contacto: contactos){ 
            if(search.equals(contacto.getName())||(Integer.parseInt(search) == contacto.getId())){
                resultados.add(contacto);
            }
        }

        if(resultados.isEmpty()){
            System.out.println("Nenhum contacto encontrado");
        } else if(resultados.size()==1){
            contactoSelecionado = resultados.get(0);
        } else {
            System.out.println("Contactos encontrados: ");
            for(Contacto contacto: resultados){
                System.out.println("ID: " + contacto.getId()+", Nome: "+ contacto.getName());
            }
            System.out.print("Selecione o contacto pretendido: ");
            int idEscolhido = sc.nextInt();
            
            for (Contacto ids : contactos){
                if(idEscolhido == ids.getId()){
                    contactoSelecionado = ids;
                }
            }

        }

        System.out.print("Se não for necessario alterar dar enter nesse campo");
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


        if(!nome.isEmpty()){
            contactoSelecionado.setNome(nome);
        }
        if(CC!=0){
            contactoSelecionado.setCC(CC);
        }
        if(!dataInput.isEmpty()){
            contactoSelecionado.setDataNasc(dataNasc);
        }
        if(!email.isEmpty()){
            contactoSelecionado.setEmail(email);
        }
        if(ntelemovel!=0){
            contactoSelecionado.setNtelemovel(ntelemovel);
        }
        sc.close();
    }

    public static void procurarContacto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pesquisar por número ou nome");
        String search = sc.next();
        ArrayList<Contacto> resultados = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if(search.equals(contacto.getName())||(Integer.parseInt(search) == contacto.getId())){
                resultados.add(contacto);
            }
        }

        if(resultados.isEmpty()){
            System.out.println("Nenhum contacto encontrado");
        }  

        System.out.println("Contactos encontrados: ");
        
        for(Contacto contacto: resultados){
            System.out.println("ID: " + contacto.getId()+", Nome: "+ contacto.getName());
        }

        sc.close();
    }

    public static void apagarContacto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pesquisar por número ou nome");
        String search = sc.next();
        ArrayList<Contacto> resultados = new ArrayList<>();
        Contacto contactoSelecionado = null;
        for(Contacto contacto: contactos){ 
            if(search.equals(contacto.getName())||(Integer.parseInt(search) == contacto.getId())){
                resultados.add(contacto);
            }
        }
        if(resultados.isEmpty()){
            System.out.println("Nenhum contacto encontrado");
        } else if(resultados.size()==1){
            contactoSelecionado = resultados.get(0);
        } else {
            System.out.println("Contactos encontrados: ");
            for(Contacto contacto: resultados){
                System.out.println("ID: " + contacto.getId()+", Nome: "+ contacto.getName());
            }
            System.out.print("Selecione o contacto pretendido: ");
            int idEscolhido = sc.nextInt();
            for (Contacto ids : contactos){
                if(idEscolhido == ids.getId()){
                    contactoSelecionado = ids;
                }
            }
        }
        contactos.remove(contactoSelecionado);   
    }
    public static void listarContacto(){
        System.out.println("Contactos encontrados: ");
        for(Contacto contacto: contactos){
            System.out.println("ID: " + contacto.getId()+", Nome: "+ contacto.getName());
        }
    }
}