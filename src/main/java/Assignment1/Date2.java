package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Date2 {
    int day;
    int month;
    int year;

    List<Integer> monthsWith31Days;
    List<Integer> monthsWith30Days;
    public static final int JAN = 1;
    public static final int FEB = 2;
    public static final int MAR = 3;
    public static final int APR = 4;
    public static final int MAY = 5;
    public static final int JUN = 6;
    public static final int JUL = 7;
    public static final int AUG = 8;
    public static final int SEP = 9;
    public static final int OCT = 10;
    public static final int NOV = 11;
    public static final int DEC = 12;


    public Date2(int year, int month, int day){
        this.day = day;
        this.month = month;
        this.year = year;

        VerifyValidity();

        monthsWith31Days = new ArrayList<>();
        monthsWith31Days.add(JAN);
        monthsWith31Days.add(MAR);
        monthsWith31Days.add(MAY);
        monthsWith31Days.add(JUL);
        monthsWith31Days.add(AUG);
        monthsWith31Days.add(OCT);
        monthsWith31Days.add(DEC);

        monthsWith30Days = new ArrayList<>();
        monthsWith30Days.add(APR);
        monthsWith30Days.add(JUN);
        monthsWith30Days.add(SEP);
        monthsWith30Days.add(NOV);
    }

    private void VerifyValidity(){
        // verify validity of date, throw Exception if Invalid
    }

    public void add1day(){
        if( isEndOfYear() ){
            ChangeToNewYear();
        }
        else if( isEndOfMonth()){
            ChangeToNewMonth();
        }
        else{
            ChangeToNewDay();
        }

    }

    private void ChangeToNewYear(){
        day = 1;
        month = 1;
        year++;
    }

    private void ChangeToNewMonth(){
        day = 1;
        month ++;
    }

    private void ChangeToNewDay(){
        day++;
    }

    private boolean isEndOfYear(){
        return month == DEC && day == 31;
    }

    private boolean isEndOfMonth(){
        return ( monthsWith30Days.contains(month) && day == 30) ||
                ( monthsWith31Days.contains(month) && day == 31) ||
                (isEndOfFeb());
    }

    private boolean isLeapYear(){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private boolean isEndOfFeb(){
        return (isLeapYear() && month == FEB && day == 29) ||
                (!isLeapYear() && month == FEB && day == 28);
    }

    @Override
    public String toString(){
        return "dd/mm/yyyy = " + Integer.toString(day) + "/" +  Integer.toString(month)+ "/" + Integer.toString(year);
    }
}
