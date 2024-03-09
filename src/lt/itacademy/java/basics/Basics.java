package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name, surname and age");
        String input = scanner.nextLine();
        String[] separatedWords = input.split(" ");
        String name = separatedWords[0];
        String surname = separatedWords[1];
        String age = separatedWords[2];
        System.out.println("Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data Academy 2024!");
        scanner.close();


        char h = 'h';
        int ello = 3110;

        char w = 'w';
        short o = 0;
        char r = 'r';
        int l = 1;
        char d = 'd';

        float two = 2.0f;
        boolean truth = true;

        String phrase = "" + h + ello + " " + w + o + r + l + d + " " + two + " " + truth;
        System.out.println(phrase);


    }
}
