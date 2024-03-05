package lt.itacademy;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.toString();

        System.out.print("Enter your surname: ");
        String surname = scanner.toString();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        String result = "Hello my name is " + name + " " + surname + " and I am " + age + "years old. I am attending IT & Data Academy 2024!";
        System.out.println(result);
    }

}
