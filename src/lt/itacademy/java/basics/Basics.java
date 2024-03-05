package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = scanner.nextLine();

        System.out.println("Input your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Input your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data Academy 2024!");



        char charH = 'H';
        byte byteThree = 3;
        int intEleven = 11;
        short shortZero = 0;
        char charW = 'w';
        int intZero = 0;
        char charR = 'r';
        int intOne = 1;
        char charD = 'd';
        float floatTwo = 2.0f;
        boolean booleanTrue = true;
        String StringChar = Character.toString(charH);

        System.out.println(StringChar + byteThree + intEleven + shortZero + " " +
                charW + intZero + charR + intOne + charD + " " + floatTwo + " "+ booleanTrue);
    }

}





