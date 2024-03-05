package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {

    static Scanner sc = new Scanner(System.in);

    public static void read() {
        System.out.println("Write your name and surname");
        String name = sc.next();
        System.out.println("Age");
        int age = sc.nextInt();
        System.out.println("Hello name is " + name + " and I am " + age + " years old. I am attending IT & Data Academy 2024!");
    }

    public static void main(String[] args) {

        read();


    }
}
