package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    // Shortcut: main
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = myObj.nextLine();

        System.out.println("Enter your surname:");
        String surname = myObj.nextLine();

        System.out.println("Enter your age:");
        String age = myObj.nextLine();

        System.out.println("Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data\n" +
                "Academy 2024!");
    }

}
