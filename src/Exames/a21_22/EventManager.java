package Exames.a21_22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EventManager {
    private String nome;
    private Map<Client,ArrayList<Event>> clientes = new HashMap<Client,ArrayList<Event>>();
    
    
    public EventManager(String nome) {
        this.nome = nome;
    }


    public Client addClient(String  nome,String localidade){
        Client cliente = new Client(nome,localidade);
        ArrayList<Event> eventos= new ArrayList<>();
        clientes.put(cliente, eventos);
        return cliente;
    }


    public Event addEvent(Client cliente, LocalDate localDate){
        Event event = new Event(localDate);
        ArrayList<Event> eventos = clientes.get(cliente);
        eventos.add(event);
        clientes.replace(cliente, clientes.get(cliente), eventos);
        return event;

    }





    
    
}
