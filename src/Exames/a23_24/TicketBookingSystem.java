package Exames.a23_24;

import java.util.ArrayList;
import java.util.HashMap;


public class TicketBookingSystem implements ITicketBookingSystem {
    private HashMap<Event, ArrayList<EventOccurrence>> ocorrenciaEvento;
    private HashMap<Integer, ArrayList<Ticket>> bilhetes;
    public boolean addEventOccurrence(Event event, Place place, String schedule){
        EventOccurrence c = new EventOccurrence(place, schedule);
        if(ocorrenciaEvento.get(event)!= null){
            ocorrenciaEvento.put(event, new ArrayList<>());
            ocorrenciaEvento.get(event).add(c);
            return true;
        } else {
            for(EventOccurrence eo: ocorrenciaEvento.get(event)){
                if(eo.getDataHora().equals(schedule)){
                    return false;
                }
            }
            ocorrenciaEvento.get(event).add(c);
            return true;
        }
    }

    public int bookTickets(int eventId, int numTickets) {
        ArrayList<Ticket> bilhetes = new ArrayList<>(numTickets);
        
        bilhetes.put(eventId, bilhetes);
        Ticket ticket = new Ticket(null, numTickets);
        return ticket.getReferencia();
    }



}
