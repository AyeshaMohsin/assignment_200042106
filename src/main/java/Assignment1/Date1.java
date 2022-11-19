package Assignment1;

public class Date1 {

    int day;
    int month;
    int year;

    public Date1(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void add1day(){
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) {
            day = 1; month++;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            day = 1; month++;
        } else if ((month == 12) && day == 31) {
            day = 1; month = 1; year++;
        } else if ((month == 2)) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                if (day == 29) {
                    day = 1; month++;
                } else {
                    day = day + 1;
                }
            } else {
                if (day == 28) {
                    day = 1; month++;
                }
            }
        } else {
            day = day + 1;
        }
    }

    @Override
    public String toString(){
        return "dd/mm/yyyy = " + Integer.toString(day) + "/" +  Integer.toString(month)+ "/" + Integer.toString(year);
    }
}
