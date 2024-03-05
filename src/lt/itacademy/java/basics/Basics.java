package lt.itacademy.java.basics;
import java.util.Scanner;

public class Basics {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String myName = scanner.nextLine();

        System.out.println("Enter surname");
        String mySurname = scanner.nextLine();

        System.out.println("Enter age:");
        int myAge = scanner.nextInt();

        System.out.println("Hello my name is " +
                myName + " " +
                mySurname + " and I am " +
                myAge + " years old. I am attending IT & Data Academy 2024!");
    }
}
