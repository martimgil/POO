package aula07;

public class DateND extends Date {
    private int daysSince2000;

    private static int base_year = 2000;
    private static int base_month = 1;
    private static int base_day = 1;

    public DateND(int daysSince2000){
        this.daysSince2000 = daysSince2000;
    }

    public DateND(int day, int month, int year){
        if(valid(day,month, year)){
            this.daysSince2000 = calculateDaysSince2000(day, month, year);
        }
    }
    
    @Override
    public int getDay() {
        return convertToDate()[0];
    }

    @Override
    public int getMonth() {
        return convertToDate()[1];
    }

    @Override
    public int getYear() {
        return convertToDate()[2];
    }


    public void increment(){
        daysSince2000++;
    }

    public void decrement(){
        daysSince2000--;
    }

    public void set (int day, int month, int year){
        if(valid(day, month, year)){
            this.daysSince2000 = calculateDaysSince2000(day,month, year);
        }
    }

    private int calculateDaysSince2000(int day, int month, int year){
        int days = 0;

        for(int y=base_year; y<year; y++){
            days +=leapYear(y) ? 366:365;
        }

        for (int m=1; m<month; m++){
            days += monthDays(month, year);
        }
        days += day-base_day;

        return days;
    }
    
    private int[] convertToDate(){
        int year = base_year;
        int days = daysSince2000;
       
        while (days >= (leapYear(year) ? 366 : 365)) {
            days -= leapYear(year) ? 366 : 365;
            year++;
        }
        int month = 1;
        while (days >= monthDays(month, year)) {
            days -= monthDays(month, year);
            month++;
        }
        int day = days + 1;
        return new int[]{day, month, year};
    }

    @Override
    public String toString() {
        int[] date = convertToDate();
        return String.format("%04d-%02d-%02d", date[2], date[1], date[0]);
    }
}
