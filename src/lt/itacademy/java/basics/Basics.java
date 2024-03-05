package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: \n");
        String name = scan.nextLine();

        System.out.println("Enter your surname: \n");
        String surname = scan.nextLine();


        System.out.println("Enter your name: \n");
        String age = scan.nextLine();


        System.out.println("Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data Academy 2024!");


        //  Task 2

        String something = "H3110";

        int myNumber = 123;

        float doubleNumber = 2.0f;

        char myChar = 'A';

        boolean myTrue = true;

        byte b = 1;

        short sh = 10;


        System.out.println(something + " " + doubleNumber + " " + myChar + " " + myTrue + " " + myNumber + " " + b + " " + sh);


    }
}
