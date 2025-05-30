package aula12;

import java.time.LocalDate;

public class ContactsTester {
    public static void main(String[] args) {
        ContactManager cm = new ContactManager();

        // --------------------------
        Contact c1 = new Contact("Maria Joaquina", 911234567, "joaquina@ua.pt", LocalDate.parse("1985-01-01"));
        Contact c2 = new Contact("João Miguel", 911234568, "joao@ua.pt", LocalDate.parse("1988-01-01"));
        cm.addContact(c1);
        cm.addContact(c2);
        cm.printAllContacts();
        // --------------------------

        c1 = cm.getContact(1);
        System.out.println(c1);
        c2 = cm.getContact(2);
        System.out.println(c2);
        cm.call(0, 12.5);
        cm.sendEmail(1);
        cm.sendEmail(1);
        System.out.println(cm.getContact(5));           // -- não existe!
        System.out.println(cm.calculateContactCost());
        // --------------------------

        cm.printAllContacts();
        // --------------------------

        cm.readFile("C:\\Users\\Marti\\OneDrive - Universidade de Aveiro\\Universidade\\1ºano\\Programação Orientada a Objetos\\Praticas\\src\\aula12\\contatos.txt");
        cm.printAllContacts();
        // --------------------------

        c1 = cm.getContact(1);
        System.out.println(c1);
        c2 = cm.getContact(2);
        System.out.println(c2);
        System.out.println(cm.getContact(5));
        System.out.println(cm.calculateContactCost());
        // --------------------------

        cm.writeFile("out.txt");
    }
}
