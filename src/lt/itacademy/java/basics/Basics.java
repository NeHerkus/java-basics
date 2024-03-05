package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//      First task
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String surname = sc.nextLine();
        int years = sc.nextInt();

        System.out.println("Hello my name is " + name + " " + surname + " and I am " + years + " a years old. I am attending IT & Data Academy 2024!");

//      Second task
        char charValueH = 'H';
        byte byteValue = 3;
        short shortValue = 11;
        int intValueZero = 0;
        char charValueW = 'W';

        float floatNumber = 2.0f;
        boolean booleanValue = true;

        String concatenation = charValueH + "" + byteValue + shortValue + intValueZero + " " + charValueW + intValueZero + "r" + 1 + "d " +
                floatNumber + " " + booleanValue;
        System.out.println(concatenation);

    }
}
