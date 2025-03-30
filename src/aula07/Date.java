package aula07;

abstract class Date {
    public abstract void increment();
    public abstract void decrement();
    public abstract void set(int day, int month, int year);
    public abstract int getDay();
    public abstract int getMonth();
    public abstract int getYear();
    

    public static boolean validMonth(int month) {
        return month >= 1 && month <= 12;
    }
    public static boolean valid(int day, int month, int year){
        return validMonth(month)&& (day<=monthDays(month, year));
    }

    public static int monthDays(int month, int year) {
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
    
    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    

}
