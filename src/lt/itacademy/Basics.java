package lt.itacademy;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        System.out.println(secondTaskResult());

    }

    //-- 1 task --
    private static String firstTaskResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your surname: ");
        String surname = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        return "Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data Academy 2024!";
    }

    //-- 2 task --
    private static String secondTaskResult(){
        char char1 = 'H';
        byte byteNum= 3;
        short shortNum = 1;
        int intNum = 10;
        String stringWord = "w0r1d";
        float floatNum = 2.0f;
        boolean bool = true;

        return char1 + byteNum + shortNum + intNum + " " + stringWord + " " + floatNum + " " + bool;
    }

}
