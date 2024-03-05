package lt.itacademy.java.basics;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter days per year: ");
        int daysPerYear = scanner.nextInt();
        int hours = 0;
        int minutes = 0;

//        for (int i = 1; i <= daysPerYear; i++) {
//            for (int hrs = 0; hrs < 24; hrs++) {
//                hours++;
//                for (int mins = 0; mins < 60; mins++) {
//                    minutes++;
//                }
//            }
//        }
//
//        System.out.printf("""
//                There are %s hours or %s minutes in one year.
//                """, hours, minutes);

        int days = 1;
        while (days <= daysPerYear) {
            int hrs = 0;
            while (hrs < 24) {
                hrs++;
                int mins = 0;
                while (mins < 60) {
                    mins++;
                    minutes++;
                }
                hours++;
            }
            days++;
        }
        System.out.printf("""
                There are %s hours or %s minutes in one year.
                """, hours, minutes);

        System.out.println("enter number: ");
        int myNumber = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= myNumber; i++) {
            factorial *= i;
        }
        System.out.printf("""
                Factorial of %s is %s.
                """, myNumber, factorial);
    }
}
