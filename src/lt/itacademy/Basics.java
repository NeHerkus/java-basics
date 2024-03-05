package lt.itacademy;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        System.out.println(firstTaskResult());

    }

    //-- 1 task --
    public static String firstTaskResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your surname: ");
        String surname = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        return "Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data Academy 2024!";


    }

}
