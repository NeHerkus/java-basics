package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {

  private int side1, side2, side3;

  public Operators(int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public boolean isScalene() {
    return (side1 != side2 && side1 != side3) || (side2 != side1 && side2 != side3);

  }
  public boolean isIsosceles() {
    if (side1 == side2 || side1 == side3) {
      return true;
    } else if (side2 == side1 || side2 == side3) {
      return true;
    }
    return false;
  }
  public boolean isEquilateral() {
    return side1 == side2 && side1 == side3;
  }

  public boolean isValidTriangle() {
    return  (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
  }

  public void printType(String type) {
    System.out.println("Triangle is " + type + ". Sides: " + side1 + ' ' + side2 + ' ' + side3);

  }

  public void checkTypeOfTriangle(){
    if(!isValidTriangle()) {

      printType("invalid");
    } else if (isEquilateral()) {
      printType("Equilateral");
    } else if (isIsosceles()) {
      printType("Isosceles");
    } else {
      printType("Scalene");
    }
  }

  public static void main(String[] args) {


    Scanner reader = new Scanner(System.in);

    System.out.println("Side 1: ");
    int side1 = reader.nextInt();

    System.out.println("Side 2: ");
    int side2 = reader.nextInt();

    System.out.println("Side 3: ");
    int side3 = reader.nextInt();

    Operators operators = new Operators(side1, side2, side3);
    operators.checkTypeOfTriangle();
  }
}