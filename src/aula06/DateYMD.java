package aula06;

public class DateYMD {
    int day;
    int month;
    int year;
    

    public DateYMD(int day, int month, int year) {
        if (valid(day, month, year)){
        this.day = day;
        this.month = month;
        this.year = year;
        }
    }

    public void set(int day, int month, int year){
        if(valid(day, month, year)){
            this.day=day;
            this.month = month;
            this.year = year;
        }
    }
    
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    static boolean validMonth(int month) {
        return month >= 1 && month <= 12;
    }
    static boolean valid(int day, int month, int year){
        return validMonth(month)&& (day<=monthDays(month, year));
    }
    

    public void increment(){

        if (day==monthDays(month, year)){
            day = 1;
            if (month==12){
                month=1;
                year++;
            } else{
                month++;
            }

        } else {
            day++;
        }
    }


    public void decrement(){
        if (day==1){
            day = monthDays(month, year);
            if (month==1){
                month=12;
                year--;
            } else{
                month--;
            }

        } else {
            day--;
        }

    }

    static int monthDays(int month, int year) {
        boolean leapYear = leapYear(year);
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2 && leapYear) {
            return 29;
        } else if (month == 2) {
            return 28;
        }
        return 0;
    }

    static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day); // Formato YYYY-MM-DD
    }
}
