package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {

  public static void convertFeetAndInchToCm(double feet, double inches) {

    double inchToCm = inches * 2.54;

    double footToCm = 12 * 2.54 * feet;

    double totalCm = inchToCm + footToCm;

    System.out.println(feet + " feet and " + inches + " inches = " + totalCm + " cm");
  }

  public static void main(String[] args) {

//    Task 3
    Scanner reader = new Scanner(System.in);

    System.out.println("Enter edge value: ");

    int edge = reader.nextInt();

    double volume = Math.pow(edge, 3);

    double perimeter = edge * 12;

    System.out.println("Cube’s volume: " + volume + "cm3");
    System.out.println("Cube’s perimeter: " + perimeter + "cm");



//    Task 4
    System.out.println("enter feet");
    double feet = reader.nextDouble();

    System.out.println("enter inch");
    double inch = reader.nextDouble();

    convertFeetAndInchToCm(feet, inch);


  }
}