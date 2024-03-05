package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){

        char someChar = 'H';
        int someInt = 3;
        byte someByte = 1;
        short someShort = 10;
        String someString = "W0r1d";
        float someFloat = 2.0F;
        boolean someBoolean = true;

        System.out.printf("%c%d%d%d %s %.1f %b%n", someChar, someInt, someByte,
                          someShort, someString, someFloat, someBoolean);

        System.out.println(getNameAndAge());
    }

    public static String getNameAndAge(){

        String name = getUserInputString("Enter your first name:");
        while (name.isEmpty()) {
            name = getUserInputString("Name is empty! Enter your first name");
        }

        String surname = getUserInputString("Enter your surname");
        while (surname.isEmpty()) {
            surname = getUserInputString("Surname is empty! Enter your surname");
        }

        String age = getUserInputString("Enter your age");
        while (age.isEmpty()) {
            age = getUserInputString("Age is empty! Enter your age");
        }

        return String.format("Hello my name is %s %s and I am %s years old." +
                " I am attending IT & Data Academy 2024",name, surname, age);
    }

    public static String getUserInputString(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }
}
