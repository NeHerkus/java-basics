package lt.itacademy.java.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.*;

public class CarTravel {
    public static void main(String[] args) {
        carTravel();
    }


    public static void carTravel() {

        DecimalFormat df = new DecimalFormat("#.#");

        Scanner scanner = new Scanner(in);
        out.print("Enter range, fuel amount in the tank, fuel usage and current fuel price: ");
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int distance = Integer.parseInt(inputArr[0]);
        float fuel = Float.parseFloat(inputArr[1]);
        float usage = Float.parseFloat(inputArr[2]);
        float price = Float.parseFloat(inputArr[3]);

        float fuelRange = usage/100*distance;

        if (fuel >= fuelRange) {
            out.println("Destination is in " + distance + "km. Car is able to reach the destination." +
                    "It will have " + df.format(fuel - fuelRange) + " liters of fuel left.");
        } else {
            out.println("Destination is in " + distance + "km. Car is not able to reach the destination." +
                    "It needs " + df.format(fuelRange - fuel) + " liter of fuel more. It will cost " + (fuelRange - fuel)*price);
        }
    }
}
