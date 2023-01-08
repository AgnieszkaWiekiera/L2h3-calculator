package org.example;

public class daysOfTheWeek {
    public static void main(String[] args){
        System.out.println(printDayOfWeek(11));

    }
    public static String printDayOfWeek (int dayNumber){
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
            case 7:
                return "Weekend";
            default:
                return "There is no such a day!";
        }

    }
}
