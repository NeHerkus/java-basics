package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basic {
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    System.out.println("First name: ");
    String name = reader.nextLine();

    System.out.println("Surname: ");
    String surname = reader.nextLine();

    System.out.println("Age: ");
    int age = reader.nextInt();

    System.out.println("Hello my name is " + name + " " + surname + " and I am " + age + "years old. I am attending IT & Data Academy 2024!");

//    Create all of the primitives (except long and double) with different values. Concatenate them into a
//    string and print it to the screen.
//
//            Output: H3110 w0r1d 2.0 true

    boolean booleanType = true;
    char letter = 'H';
    int number = 3110;

  }
}
