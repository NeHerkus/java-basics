package lt.itacademy.java.basics;

import java.time.chrono.IsoEra;
import java.util.Objects;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        DoTaskTen();
    }

    private static void DoTaskTen()
    {
        while (true)
        {
            System.out.println("Enter a shape name and side lengths separated by spaces:");

            var scanner = new Scanner(System.in);
            var rawInput = scanner.nextLine();
            var separatedInput = rawInput.split("\\s+");

            // Input count validation
            if (separatedInput.length <= 1)
            {
                PrintErrorMessage();

                continue;
            }

            var shape = separatedInput[0];
            double perimeter = 0;
            double area = 0;

            // Edges validation
            if (!HasPassedValidation(separatedInput))
            {
                System.out.println(separatedInput[0] + " edge can't be 0 or below.");

                continue;
            }

            switch (shape)
            {
                case "Square":
                case "Rectangle":
                    if (separatedInput.length != 3)
                    {
                        PrintErrorMessage();

                        continue;
                    }

                    var width = Integer.parseInt(separatedInput[1]);
                    var height = Integer.parseInt(separatedInput[2]);
                    perimeter = CalculateRectanglePerimeter(width, height);
                    area = CalculateRectangleArea(width, height);

                    break;
                case "Triangle":
                    if (separatedInput.length != 4)
                    {
                        PrintErrorMessage();

                        continue;
                    }

                    var a = Integer.parseInt(separatedInput[1]);
                    var b = Integer.parseInt(separatedInput[2]);
                    var c = Integer.parseInt(separatedInput[3]);
                    perimeter = CalculateTrianglePerimeter(a, b, c);
                    area = CalculateTriangleArea(a, b, c);

                    break;
            }

            System.out.println(separatedInput[0] + " perimeter is " + perimeter + " and area is " + area);

            System.out.println("Do you want to continue? [Y/N]");

            var answer = scanner.nextLine();
            if (!Objects.equals(answer, "Y")) break;
        }
    }

    private static int CalculateRectanglePerimeter(int width, int height)
    {
        return 2 * width + 2 * height;
    }

    private static int CalculateTrianglePerimeter(int opp, int adj, int hypo)
    {
        return opp + adj + hypo;
    }

    private static int CalculateRectangleArea(int width, int height)
    {
        return width * height;
    }

    private static double CalculateTriangleArea(int a, int b, int c)
    {
        var s = (a + b + c) / 2f;

        return Math.sqrt(s * (s - a) * (s - b) * (s- c));
    }

    private static void PrintErrorMessage()
    {
        System.out.println("Entered values are wrong!");
    }

    private static boolean HasPassedValidation(String separatedInput[])
    {
        for (int i = 1; i < separatedInput.length; i++) {
            var strToInt = Integer.parseInt(separatedInput[i]);
            if (strToInt <= 0)
            {
                return false;
            }
        }

        return true;
    }
}

