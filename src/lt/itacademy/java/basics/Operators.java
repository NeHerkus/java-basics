package lt.itacademy.java.basics;

import java.util.Scanner;

class Operators {

    public static void main(String[] args) {

        System.out.println(Triangle());

        System.out.println(Car());
    }

    static String Triangle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int side1 = sc.nextInt();

        System.out.print("Enter second side: ");
        int side2 = sc.nextInt();

        System.out.print("Enter second side: ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            return ("Triangle is Equilateral. Sides: " + side1 + " " + side2 + " " + side3);
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return ("Isosceles");
        } else {
            return """
                    Triangle is invalid. Sides: %d %d %d
                     """.formatted(side1, side2, side3);
        }
    }

    static String Car() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance to the destination: ");
        int distance = sc.nextInt();

        System.out.print("How much fuel does the car have in the tank? ");
        int fuel = sc.nextInt();

        System.out.print("Car fuel usage per 100km: ");
        int fuelUsage = sc.nextInt();

        System.out.print("Fuel price per liter: ");
        float fuelPrice = sc.nextFloat();

        double fuelLeft = fuel - (fuelUsage * (distance * 0.01));

        float fuelNeed = (float) Math.abs(fuelLeft);
        float price = fuelNeed * fuelPrice;

        System.out.println(fuelLeft);
        if (fuelLeft >= 0) {
            return ("Destination is " + distance + "km. Car is able to reach the destination. It will have " + fuelLeft + " liters of fuel left.");
        } else
            return "Destination is in " + distance + "km. Car is not able to reach the destination. It needs " + fuelNeed + " liter of fuel more. It will cost " + price;
    }
}