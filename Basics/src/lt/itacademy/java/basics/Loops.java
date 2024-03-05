package lt.itacademy.java.basics;

public class Loops {
    public static void main(String[] args) {
    hoursAndMinutesFor(365);
    hoursAndMinutesWhile(365);
    factorial(5);
    }

    public static void hoursAndMinutesFor(int days) {
        if (days < 0) {
            System.out.println("Invalid Value");
        }
        int minutes = 0;
        int hours = 0;
        for (int i = 0; i < days; i++) {
            minutes = minutes + 24 * 60;
            hours = hours + 24;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }
    public static void hoursAndMinutesWhile(int days){
        if (days < 0) {
            System.out.println("Invalid Value");
        }
        int minutes = 0;
        int hours = 0;
        int i = 0;
        while (i < days) {
            minutes = minutes + 24 * 60;
            hours = hours + 24;
            i++;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }
    public static void factorial(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

