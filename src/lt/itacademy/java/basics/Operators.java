package lt.itacademy.java.basics;

import java.util.*;

public class Operators
{
    public static void main(String[] args)
    {
        DoTaskFive();
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
}
