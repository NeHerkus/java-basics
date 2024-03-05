package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static  void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        System.out.println("Hello my name is " + input[0] + " " + input[1] + " and I am " + input[2] + " years old. I am attending IT & Data Academy 2024!");

        boolean bool = true;
        float floatNum = 2.0f;
        char characterOne = 'H';
        int num = 3110;
        char characterTwo = 'w';
        byte byteOne = 0;
        byte byteTwo = 1;
        char characterThree = 'r';
        char characterFour = 'd';

        System.out.print(String.valueOf(characterOne) + String.valueOf(num));
        System.out.print(" ");
        System.out.print(String.valueOf(characterTwo) + String.valueOf(byteOne) + String.valueOf(characterThree) + String.valueOf(byteTwo) + String.valueOf(characterFour));
        System.out.print(" ");
        System.out.print(String.valueOf(floatNum) + " " + String.valueOf(bool));
    }

}
