package aula05;
import java.util.ArrayList;

class Calendario{

    private int year;
    private int firstWeekdayOfYear;
    private ArrayList<DateYMD> events = new ArrayList<>();

    
    public Calendario(int year, int firstWeekdayOfYear) {
        this.year = year;
        this.firstWeekdayOfYear = firstWeekdayOfYear;
    }

    public int getYear() {
        return year;
    }

    public int getFirstWeekdayOfYear() {
        return firstWeekdayOfYear;
    }
    
    public int firstWeekdayOfMonth(int month){

        int days = 0;
        for (int i=1; i<month; i++){
            days += DateYMD.monthDays(i, year);

        }
        return (firstWeekdayOfYear + days%7)%7;
    }

    public void addEvent(DateYMD date){
        if(DateYMD.valid(date.day, date.month, date.year)){
            events.add(date);
        }
    }
    public String monthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }

    public String printMonth(int month) {
        String s = "";
        int daysInMonth = DateYMD.monthDays(month, year);
        int firstWeekday = firstWeekdayOfMonth(month);
        s += String.format("%20s", monthName(month) + " " + year + "\n");
    
        s += "Su  Mo  Tu  We  Th  Fr  Sa\n";
    
        for (int i = 1; i <= firstWeekday; i++) {
            s += "    ";
        }

        for (int day = 1; day <= daysInMonth; day++) {
            boolean hasEvent = false;
    
            for (DateYMD event : events) {
                if (event.day == day && event.month == month && event.year == year) {
                    hasEvent = true;
                    break;
                }
            }
    
            if (hasEvent) {
                s += "*";
            } else {
                s += " ";
            }
            s += String.format("%2d ", day);
            if ((firstWeekday + day) % 7 == 0) {
                s += "\n";
            }
        }
    
        return s;
    }

    @Override
    public String toString() {
        String s="";
        for(int i=1; i<=12;i++){
            s+=(printMonth(i) + "\n\n");
        }
        return s;

    }
}