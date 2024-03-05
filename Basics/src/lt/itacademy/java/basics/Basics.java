package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String userName = myObj.nextLine();
        String lastName = myObj.nextLine();
        Integer age = myObj.nextInt();

        System.out.println("Hello my name is " + userName + " " + lastName + " and I am " + age + " years old. I am attending IT & Data Academy 2024");

        int a = 3110;
        char b = 'B';
        double c = 2.0;
        boolean d = true;


    }
}
