package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        int days = 0;
        int minutes = 0;
        int hours = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter amount of days: ");
        days = scanner.nextInt();

        for(int i = 0; i < days; i++){
            hours +=24;
            minutes += 24*60;
        }

        System.out.println("There are "+hours +" hours or "+ minutes + " minutes in one year.");
    }
}
