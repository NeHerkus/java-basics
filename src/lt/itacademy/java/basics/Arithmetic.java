package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        Third task
        double number = sc.nextDouble();
        double volume = Math.pow(number, 3);
        double perimeter = number * 12;
        System.out.println("Cube’s volume: " + (int)volume + "cm3");
        System.out.println("Cube’s perimeter: " + (int)perimeter + "cm");

//        Fourth task
        double feet = sc.nextDouble();
        double inches = sc.nextDouble();
        System.out.println(feet + " feet and " + inches + " inches = " + convertInchesToCentimetres(feet, inches) + " cm");
    }
    public static double convertInchesToCentimetres(double feet, double inches){
        double convertedNumber;
        inches += 12 * feet;
        return (inches * 2.54);
    }
}
