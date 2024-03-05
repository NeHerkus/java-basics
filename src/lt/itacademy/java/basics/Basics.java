package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data Academy 2024!");
    }
}