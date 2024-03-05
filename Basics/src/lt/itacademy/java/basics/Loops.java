package lt.itacademy.java.basics;

public class Loops {
    public static void main(String[] args) {
    hoursAndMinutes(365);
    }
    public static void hoursAndMinutes(int days) {
        if (days < 0) {
            System.out.println("Invalid Value");
        }
        int minutes = 0;
        int hours = 0;
        for(int i = 0 ; i < days; i++)
        {
            minutes = minutes + 24 * 60;
            hours = hours + 24;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
        }
    }

