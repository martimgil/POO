package aula07;


class DateYMD extends Date{
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


    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day); // Formato YYYY-MM-DD
    }
}
