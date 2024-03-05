package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println(getNameAndAge());
    }

    public static String getNameAndAge(){

        String name = getUserInputString("Enter your first name:");
        while (name.isEmpty()) {
            name = getUserInputString("Name is empty! Enter your name");
        }

        String surname = getUserInputString("Enter your surname");
        while (surname.isEmpty()) {
            surname = getUserInputString("Surname is empty! Enter your surname");
        }

        String age = getUserInputString("Enter your age");
        while (age.isEmpty()) {
            age = getUserInputString("Age is empty! Enter your age");
        }

        return "Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data Academy 2024";
    }

    public static String getUserInputString(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }
}
