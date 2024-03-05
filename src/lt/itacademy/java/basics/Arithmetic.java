package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        double volume = Math.pow(number, 3);
        double perimeter = number * 12;
        System.out.println("Cube’s volume: " + (int)volume + "cm3");
        System.out.println("Cube’s perimeter: " + (int)perimeter + "cm");
    }
}
