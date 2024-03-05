import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        task 5
//        float side1 = scanner.nextFloat(),
//                side2 = scanner.nextFloat(),
//                side3 = scanner.nextFloat();
//        determineTriangleType(side1, side2, side3);
//        System.out.printf("Sides: %.2f %.2f, %.2f", side1, side2, side3);


//        task 6
        float destination = scanner.nextFloat(), fuel = scanner.nextFloat(), fuelUsage100km = scanner.nextFloat(), fuelLiterPrice = scanner.nextFloat();
        fuelConsumptionAndCost(destination, fuel, fuelUsage100km, fuelLiterPrice);

    }

    static void determineTriangleType(float side1, float side2, float side3) {
        if (side1 == side2 && side2 == side3) {
            System.out.println("triangle is equilateral");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("triangle is isolesces");
        } else {
            System.out.println("triangle is scalene");
        }
    }

    static void fuelConsumptionAndCost(
            float distance,
            float fuel, float fuelUsage100km, float fuelLiterPrice) {
        float maxDistance = fuel * 100f /fuelUsage100km;
        System.out.println(maxDistance);
        if (maxDistance >= distance) {
            float excessFuel = (maxDistance - distance) / 100f * fuelUsage100km;
            System.out.printf("Destination is in %.2f km. Car will reach destination. It will have %.2f liters of fuel left. \n", distance, excessFuel);
        } else {
            float extraFuelNeeded = (distance - maxDistance) / 100f * fuelUsage100km;
            float extraCost = extraFuelNeeded * fuelLiterPrice;
            System.out.printf("Destination is in %.2f km. " +
                    "Car will not reach destination. It needs %.2f liters of fuel more. " +
                    "It will cost %.2f. \n", distance, extraFuelNeeded, extraCost);
        }

    }
}
