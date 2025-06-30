package Exames.a21_22;

import java.time.LocalDate;
import java.util.ArrayList;

public class Event implements IEvent {
    private LocalDate data;
    private ArrayList<Activity> lista = new ArrayList<>();

    public Event(LocalDate data) {
        this.data = data;
    }

    public void addActivity(Activity a){
        lista.add(a);

    }

    

    
}
