package it.academy.java.basics;

import java.util.Scanner;

class Basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.printf("Hello my name is %s %s and I am %d years old. I am attending IT & Data\n" +
                "Academy 2024!", name, surname, age);
    }
}
