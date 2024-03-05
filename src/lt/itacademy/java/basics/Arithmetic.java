package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Enter edge value: ");

    int edge = reader.nextInt();

    double volume = Math.pow(edge, 3);

    double perimeter = edge * 12;

    System.out.println("Cube’s volume: " + volume + "cm3");
    System.out.println("Cube’s perimeter: " + perimeter + "cm");



  }
}