package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your surname?");
        String surname = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.close();

        System.out.println("Hello my name is " + name + " " + surname + " I am " + age + " years old. I am attending IT & Data Academy 2024!");
    }
}
