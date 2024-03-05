package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics
{
    public static void main(String args[])
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
