package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter days: ");
        int days = Integer.parseInt(scanner.nextLine());

        calculateMinutesAndSeconds(days);
        System.out.println("Enter number: ");

        int number = Integer.parseInt(scanner.nextLine());
        calculateFactorial(number);
    }
//TASK8
    static void calculateMinutesAndSeconds(int year) {
        int hours = 0;
        int minutes = 0;
        if (year > 0) {

            for (int i = 1; i <= year; i++) {
                hours += 24;
                minutes = hours * 60;
            }
            System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
        } else System.out.println("Enter valid number");

    }
    //TASK9
    static void calculateFactorial (int number){
        int sum=1;
        for (int i = 1; i <= number; i++) {
            sum*=i;
        }
        System.out.println("Factorial of number "+number+" is "+sum+".");
    }

}
