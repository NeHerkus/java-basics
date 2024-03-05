package lt.itacademy.java.basics;

public class Loops {

    public static void yearCalculator() {
        int days = 365;
        int minutesInHour = 60;
        int hoursInDay = 24;
        int hours = 0;
        int minutes = 0;
        int hoursCopy = 0;


        while(days > 0) {
            hours += hoursInDay;
            days--;
        }

        hoursCopy = hours;

        while(hoursCopy > 0) {
            minutes += minutesInHour;
            hoursCopy--;
        }

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    public static void main(String[] args) {
    yearCalculator();
    }
}
