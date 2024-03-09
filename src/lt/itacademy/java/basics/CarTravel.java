package lt.itacademy.java.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CarTravel {
    private static final DecimalFormat singleDecimal = new DecimalFormat("#.#");
    private static final DecimalFormat doubleDecimal = new DecimalFormat("#.##");
    public static void main(String[] args) {
        carTravel();
    }

    private static void carTravel() {



        Scanner scanner = new Scanner(in);
        out.print("Enter range, fuel amount in the tank, fuel usage and current fuel price: ");
        String[] inputArr = scanner.nextLine().trim().split(" ");

        calculateFuelReport(
                Integer.parseInt(inputArr[0]),
                Float.parseFloat(inputArr[1]),
                Float.parseFloat(inputArr[2]),
                Float.parseFloat(inputArr[3])
        );
    }

    private static void calculateFuelReport(int distance, float fuel, float usage, float price) {
        float fuelRange = usage / 100 * distance;

        if (fuel >= fuelRange) {
            out.printf("""
                    Destination is in %skm.
                    Car is able to reach the destination.
                    It will have %s liters of fuel left.
                    """, distance, singleDecimal.format(fuel - fuelRange));
        } else {
            out.printf("""
                    Destination is in %skm.
                    Car is not able to reach the destination.
                    It needs %s liter of fuel more. It will cost %s.
                    """,
                    distance,
                    singleDecimal.format(fuelRange - fuel),
                    doubleDecimal.format((fuelRange - fuel) * price));
        }
    }
}
