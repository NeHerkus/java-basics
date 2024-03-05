package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics
{
    public static void main(String args[])
    {
        // DoTaskOne();
        var result = DoTaskTwo();

        System.out.println(result);
    }

    private static String DoTaskTwo()
    {
        char firstVar = 'H';
        int secondVar = 3;
        byte thirdVar = 110;
        char w = 'w';
        short fourthVar = 0;
        char idkVar = 'r';
        int otherVal = 1;
        char testVal = 'd';
        float fifthVar = 2.0f;
        boolean sixthVar = true;

        return String.valueOf(firstVar) + String.valueOf(secondVar) + String.valueOf(thirdVar) + " " + String.valueOf(w) + String.valueOf(fourthVar) + String.valueOf(idkVar) + String.valueOf(otherVal) + String.valueOf(testVal) + " " + String.valueOf(fifthVar) + " " + String.valueOf(sixthVar);
    }

    private static void DoTaskOne()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        var name = scanner.nextLine();

        System.out.println("Enter your surname:");
        var surname = scanner.nextLine();

        System.out.println("Enter your age:");
        var age = scanner.nextLine();

        var finalText = new StringBuilder("Hello my name is ");
        finalText.append(name + " " + surname);
        finalText.append(" and I am ");
        finalText.append(age);
        finalText.append(" years old. I am attending IT & Data Academy 2024!");

        System.out.println(finalText.toString());
    }
}
