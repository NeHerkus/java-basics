package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        printHumanData();
        printPrimitives();

    }

    public static void printHumanData() {

        System.out.println("Please enter your name, surname, age: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();
        int age = Integer.parseInt(scanner.next());

        System.out.println("Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data\n" +
                "Academy 2024!");

        scanner.close();

    }

    public static void printPrimitives() {
        boolean isTrue = true;

        char letterH = 'H';
        char letterW = 'w';
        char letterR = 'r';
        char letterD = 'd';

        int num1 = 3;
        byte num2 = 110;
        short num3 = 0;
        short num4 = 1;
        float num5 = 2.0f;

        System.out.println(letterH + "" + num1 + "" + num2 + " " + letterW + num3 + letterR + num4 + letterD + " " + num5 + " " + isTrue);
    }


}