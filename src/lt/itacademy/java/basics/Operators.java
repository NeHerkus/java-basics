package lt.itacademy.java.basics;

import java.sql.Array;
import java.util.*;

public class Operators
{
    public static void main(String[] args)
    {
        // DoTaskFive();
        DoTaskSix();
    }

    private static void DoTaskFive()
    {
        System.out.println("Enter 3 sides separated by spaces:");

        var scanner = new Scanner(System.in);
        var rawInput = scanner.nextLine();
        var separateInputs = rawInput.split("\\s+");

        if (separateInputs.length != 3) return;

        var inputsList = Arrays.stream(separateInputs).toList();
        var uniqueValues = new HashSet<>(inputsList).size();

        switch (uniqueValues)
        {
            case 1:
                System.out.println("Triangle is Equilateral. Sides: " + rawInput);

                break;
            case 2:
                System.out.println("Triangle is Isosceles. Sides: " + rawInput);

                break;
            default:
                System.out.println("Triangle is invalid. Sides: " + rawInput);

                break;
        }
    }

    private static void DoTaskSix()
    {
        System.out.println("PLease enter 4 inputs:");

        var scanner = new Scanner(System.in);
        var rawInput = scanner.nextLine();
        var separatedInput = rawInput.split("\\s+");

        if (separatedInput.length != 4) return;

        double values[] = new double[4];
        for (int i = 0; i < separatedInput.length; i++)
        {
            values[i] = Double.parseDouble(separatedInput[i]);
        }

        var usedFuel = CanDriveToDestination(values[0], values[1], values[2]);

        if (usedFuel >= 0)
        {
            System.out.println("Destination is " + values[0] + "km. Car is able to reach the destination. It will have " + String.format("%.1f", usedFuel) + " liters of fuel left.");
        }
        else
        {
            var cost = Math.abs(usedFuel) * values[3];

            System.out.println("Destination is " + values[0] + "km. Car is not able to reach the destination. It needs " + Math.abs(usedFuel) + " liter of fuel more. It will cost " + cost + ".");
        }
    }

    private static double CanDriveToDestination(double distance, double fuel, double mileage)
    {
        double countOf100s = distance / 100f;
        double usedFuel = mileage * countOf100s;

        return fuel - usedFuel;
    }
}
