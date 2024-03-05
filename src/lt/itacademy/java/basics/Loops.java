package lt.itacademy.java.basics;

public class Loops {
    public static void main(String[] args) {
        int days = 365;
        calculateHoursAndMins(days);

        int number = 5;
        calculateFactorial(number);
    }
    public static void calculateHoursAndMins(int days) {
        int hours = 0;
        int minutes = 0;
        int day = 1;

        while (day <= days) {
            hours += 24;
            minutes += 24 * 60;
            day++;
        }

        System.out.println("There are " + hours + " hours and " + minutes + " minutes per year");
    }

    public static void calculateFactorial(int number) {
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
