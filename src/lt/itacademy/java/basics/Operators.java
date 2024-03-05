package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {

  private int side1, side2, side3;

  private int distanceToDestination;
  private int fuelLevel;
  private int fuelUsagePer100Km;
  private double fuelPricePerLiter;


  public Operators(int distanceToDestination, int fuelLevel, int fuelUsagePer100Km, double fuelPricePerLiter) {
    this.distanceToDestination = distanceToDestination;
    this.fuelLevel = fuelLevel;
    this.fuelUsagePer100Km = fuelUsagePer100Km;
    this.fuelPricePerLiter = fuelPricePerLiter;
  }

  public Operators(int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public boolean isScalene() {
    return (side1 != side2 && side1 != side3) || (side2 != side1 && side2 != side3);
  }
  public boolean isIsosceles() {
    return  (side1 == side2 || side1 == side3) || (side2 == side1 || side2 == side3);
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

  public double amountOfLitersNeededToReachDestination() {
    return fuelUsagePer100Km * distanceToDestination / 100;
  }
  public boolean isAbleToReachDestination() {
//    return ((fuelLevel / fuelUsagePer100Km) * 100) >= distanceToDestination;
    return fuelLevel >= amountOfLitersNeededToReachDestination();
  }

  public void ableToArrive() {
    if (isAbleToReachDestination()) {
      double remainingFuel = this.fuelLevel - amountOfLitersNeededToReachDestination();
      System.out.println("Destination is in "
              + distanceToDestination
              + "km. Car is able to reach the destination. It will have "
              + remainingFuel + " liters of fuel left.");
    } else {
      double litersToBuy = amountOfLitersNeededToReachDestination() - fuelLevel;
      double priceToPayForFuel = litersToBuy * fuelPricePerLiter;
      System.out.println("Destination is in "
              + distanceToDestination
              + "km. Car is not able to reach the destination. It needs " + litersToBuy
              + " liter of fuel more."
              + "it will cost "
              + priceToPayForFuel
              + '.');
    }
  }

  public static void main(String[] args) {

//    Task 5

    Scanner reader = new Scanner(System.in);

//    System.out.println("Side 1: ");
//    int side1 = reader.nextInt();
//
//    System.out.println("Side 2: ");
//    int side2 = reader.nextInt();
//
//    System.out.println("Side 3: ");
//    int side3 = reader.nextInt();
//
//    Operators operators = new Operators(side1, side2, side3);
//    operators.checkTypeOfTriangle();

//    Task 6
    System.out.println("distance to the destination (km): ");
    int distanceToDestination = reader.nextInt();

    System.out.println("how much fuel does the car have in the tank?: ");
    int fuelLevel = reader.nextInt();

    System.out.println("car fuel usage per 100km: ");
    int fuelUsagePer100Km = reader.nextInt();

    System.out.println("fuel price per liter: ");
    double fuelPricePerLiter = reader.nextDouble();

    Operators operators = new Operators(distanceToDestination, fuelLevel, fuelUsagePer100Km, fuelPricePerLiter);

    System.out.println(operators.isAbleToReachDestination());
    operators.ableToArrive();
  }
}