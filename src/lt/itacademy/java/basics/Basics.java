package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args){
//      First task
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String surname = sc.nextLine();
        int years = sc.nextInt();

        System.out.println("Hello my name is " + name + " " + surname + " and I am " + years + " a years old. I am attending IT & Data Academy 2024!");

//      Second task
        String hello = "H3110 w0r1d ";
        float number = 2.0f;
        boolean yes = true;
        System.out.println(hello + number + " " + yes);

    }
}
