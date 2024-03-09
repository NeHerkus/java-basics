package lt.itacademy.java.basics;

import java.util.Objects;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        doTaskTen();
    }

    private static void doTaskTen()
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
                printErrorMessage();

                continue;
            }

            var shape = separatedInput[0];
            double perimeter;
            double area;

            // Edges validation
            if (!hasPassedValidation(separatedInput))
            {
                System.out.println(separatedInput[0] + " edge can't be 0 or below.");

                continue;
            }

            switch (shape)
            {
                case "Square":
                    if (separatedInput.length != 2)
                    {
                        printErrorMessage();

                        continue;
                    }

                    var edgeLength = Integer.parseInt(separatedInput[1]);
                    perimeter = calculateRectanglePerimeter(edgeLength, edgeLength);
                    area = calculateRectangleArea(edgeLength, edgeLength);

                    break;
                case "Rectangle":
                    if (separatedInput.length != 3)
                    {
                        printErrorMessage();

                        continue;
                    }

                    var width = Integer.parseInt(separatedInput[1]);
                    var height = Integer.parseInt(separatedInput[2]);
                    perimeter = calculateRectanglePerimeter(width, height);
                    area = calculateRectangleArea(width, height);

                    break;
                case "Triangle":
                    if (separatedInput.length != 4)
                    {
                        printErrorMessage();

                        continue;
                    }

                    var a = Integer.parseInt(separatedInput[1]);
                    var b = Integer.parseInt(separatedInput[2]);
                    var c = Integer.parseInt(separatedInput[3]);
                    perimeter = calculateTrianglePerimeter(a, b, c);
                    area = calculateTriangleArea(a, b, c);

                    break;
                default:
                    printErrorMessage();

                    continue;
            }

            System.out.println(separatedInput[0] + " perimeter is " + perimeter + " and area is " + area);

            System.out.println("Do you want to continue? [Y/N]");

            var answer = scanner.nextLine();
            if (!Objects.equals(answer, "Y")) break;
        }
    }

    private static int calculateRectanglePerimeter(int width, int height)
    {
        return 2 * width + 2 * height;
    }

    private static int calculateTrianglePerimeter(int opp, int adj, int hypo)
    {
        return opp + adj + hypo;
    }

    private static int calculateRectangleArea(int width, int height)
    {
        return width * height;
    }

    private static double calculateTriangleArea(int a, int b, int c)
    {
        var s = (a + b + c) / 2f;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private static void printErrorMessage()
    {
        System.out.println("Entered values are wrong!");
    }

    private static boolean hasPassedValidation(String separatedInput[])
    {
        for (int i = 1; i < separatedInput.length; i++)
        {
            var strToInt = Integer.parseInt(separatedInput[i]);
            if (strToInt <= 0)
            {
                return false;
            }
        }

        return true;
    }
}

