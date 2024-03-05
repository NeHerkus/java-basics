package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Task 8
        calculateMinutesAndHours(scanner);
        //Task 9
        System.out.println(factorialNumber(scanner.nextInt()));
    }

    public static void calculateMinutesAndHours(Scanner scanner){
        int days = 0;
        int minutes = 0;
        int hours = 0;

        System.out.println("Please enter amount of days: ");
        days = scanner.nextInt();


        while(days != 0){
            hours +=24;
            minutes += 24*60;
            days--;
        }
//        for(int i = 0; i < days; i++){
//            hours +=24;
//            minutes += 24*60;
//        }

        System.out.println("There are "+hours +" hours or "+ minutes + " minutes in one year.");
    }

    public static int factorialNumber(int n){
        int res = 1;
        while(n - 1 > 0){
            res *= n;
            n--;
        }
        return res;
    }
}
