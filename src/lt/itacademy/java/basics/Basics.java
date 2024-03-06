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

//        System.out.println("Hello my name is " +
//                myName + " " +
//                mySurname + " and I am " +
//                myAge + " years old. I am attending IT & Data Academy 2024!");

        System.out.printf("""
                Hello my name is %s %s and I am %s years old. I am attending IT & Data Academy 2024!
                """, myName, mySurname, myAge);

        char hLetter = 'H';
        int numbOne = 1;
        byte numbThree = 3;
        short numbZero = 0;
        char space = ' ';
        char wLetter = 'w';
        char rLetter = 'r';
        char dLetter = 'd';
        float twoPointO = 2.0f;
        boolean ofCourse = true;

        String hello = String.valueOf(hLetter) + numbThree + numbOne + numbOne + numbZero + space +
                wLetter + numbZero + rLetter + numbOne + dLetter + space +
                twoPointO + space + ofCourse;

        System.out.println(hello);
        scanner.close();

    }

}
