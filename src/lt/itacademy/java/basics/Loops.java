package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days in a year we have?");
        int days = scanner.nextInt();

        daysToHoursAndMinutes(days);
    }
    public static void daysToHoursAndMinutes(int days){
        int hours = 0;
        int minutes = 0;

        // starting from 1, because there are no 0 days.

        // Task 7
//        for(int i = 1; i <= days; i++){
//            hours += 24;
//            minutes += 1440;
//        }
//        System.out.printf("There are %d hours or %d minutes in one year", hours, minutes);

        // Task 8
        while( days > 0){
            hours += 24;
            minutes += 1440;
            days--;
        }
        System.out.printf("There are %d hours or %d minutes in one year", hours, minutes);
    }
}
