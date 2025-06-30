package Exames.a21_22;

import java.time.LocalDate;

public interface IEvent {
 
    Event addActivity(Activity activity);
    LocalDate getDate();
    double totalPrice();
    
}
