package lt.itacademy.java.basics;

import java.util.*;


public class Operators {


    public static void main(String[] args) {

        //// Task #5

        Scanner scanner = new Scanner(System.in);

        Dictionary<Double, String> stringDict = new Hashtable<>();
        stringDict.put(1.0, "Equilateral");
        stringDict.put(2.0, "Isosceles");
        stringDict.put(3.0, "Scalene");

        ArrayList<Double> Triangle = new ArrayList<>();

        Triangle.add(Double.valueOf(scanner.next()));
        Triangle.add(Double.valueOf(scanner.next()));
        Triangle.add(Double.valueOf(scanner.next()));

        double stringDictKey = determineTriangleType(Triangle);

        System.out.println("Triangle is : " + stringDict.get(stringDictKey));


        //// Task #6
        System.out.println("Please enter distance, current_fuel, fuel_usage, price_per_liter");


        double distance = Double.parseDouble(scanner.next());
        double currentFuel = Double.parseDouble(scanner.next());
        double fuelUsage = Double.parseDouble(scanner.next());
        double pricePerLiter = Double.parseDouble(scanner.next());

        determineIsPossible(distance, currentFuel, fuelUsage, pricePerLiter);

        scanner.close();

    }

    public static double determineTriangleType(ArrayList<Double> triangle_values) {


        double num1 = Collections.frequency(triangle_values, triangle_values.get(0));
        double num2 = Collections.frequency(triangle_values, triangle_values.get(1));
        double num3 = Collections.frequency(triangle_values, triangle_values.get(2));

        return Math.max(num1, Math.max(num2, num3));
    }

    public static void determineIsPossible(double distance, double currentFuel, double fuelUsage, double pricePerLiter) {

        double totalFuelUsage = distance / 100 * fuelUsage;
        currentFuel = currentFuel - totalFuelUsage;

        if (currentFuel < 0) {

            double fuel_price = (currentFuel * -1) * pricePerLiter;
            System.out.printf("Destination is in %f. Car is not able to reach the destination. It needs %f liter of fuel more. It will cost %f ", distance, currentFuel * -1, fuel_price);

        } else {

            System.out.printf("Destination is in %f. Car is able to reach the destination. It has %f liters of fuel left.",distance,currentFuel );

        }
    }
}
