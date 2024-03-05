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

    public static void factorialCalculator(int number) {
        long fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of number " + number + " is " + fact + ".");
    }

    public static void main(String[] args) {
//    yearCalculator();
        factorialCalculator(5);
    }
}
