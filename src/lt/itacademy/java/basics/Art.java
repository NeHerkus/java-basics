package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art
{
    public static void main(String[] args)
    {
        System.out.println("Please enter tree height:");

        var scanner = new Scanner(System.in);
        var rawInput = scanner.nextLine();
        var height = Integer.parseInt(rawInput);

        var stringBuilder = new StringBuilder();
        for (int i = 0; i < height; i++)
        {
            var j = height - i;
            stringBuilder.append(" ".repeat(j));
            stringBuilder.append("#".repeat(1 + i * 2));
            stringBuilder.append("\n");
        }

        stringBuilder.append(" ".repeat(height)).append("#");

        System.out.println(stringBuilder);
    }
}
