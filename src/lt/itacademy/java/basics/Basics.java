package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        String name = parts[0];
        String surname = parts[1];
        int age = Integer.parseInt(parts[2]);

        String message = "Hello, my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data Academy 2024!";
        System.out.println(message);
        scanner.close();
    }
}
