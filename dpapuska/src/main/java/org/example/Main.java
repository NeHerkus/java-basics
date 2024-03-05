package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, surname and age.");

        String input = scanner.nextLine();
        String[] inputValues = input.split("\\s+");
        String name = inputValues[0];
        String surname = inputValues[1];
        int age = Integer.parseInt(inputValues[2]);

        if(inputValues.length >= 3) {
            System.out.printf("Hello my name is %s %s and I am %d years old. I am attending IT & Data\n" + "Academy 2024!", name, surname, age);
        }

        int let0 = 3110;
        char let1 = 'H';
        char let2 = 'w';
        int let3 = 0;
        char let4 = 'r';
        int let5 = 1;
        char let6 = 'd';
        float let7 = 2.0f;
        boolean let8 = true;

        System.out.println(let1 + "" + let0 + " " + let2 + let3 + let4 + let5 + let6 + " " + let7 + " " + let8);
    }
}