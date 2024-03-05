package lt.itacademy.java.basics;

public class Loops {

    public static void yearToHoursMinutes(int daysPerYear) {
        int hours = 0;
        long minutes = 0;
        int i = 0;
        while (i < daysPerYear) {
            hours += 24;
            minutes += 1440;
            i++;
        }
        System.out.printf("There are %d hours or %d minutes in one year.", hours, minutes);
    }

    public static int numberFactorial(int number) {
        int factorial = 1;
        for (int i = 0; i < number; i++) {
            factorial = (number - i) * factorial;
        }
        return factorial;
    }

    public static void main(String[] args) {
//        yearToHoursMinutes(365);
        System.out.println(numberFactorial(5));
    }
}
