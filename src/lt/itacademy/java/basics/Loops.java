package lt.itacademy.java.basics;

public class Loops {

    public static void yearCalculator() {
        int minutesInHour = 60;
        int hoursInDay = 24;
        int hours = 0;
        int minutes = 0;

        for (int i = 0; i < 365; i++) {
            hours += hoursInDay;
        }

        for (int i = 0; i < hours; i++) {
            minutes += minutesInHour;
        }

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    public static void main(String[] args) {
    yearCalculator();
    }
}
