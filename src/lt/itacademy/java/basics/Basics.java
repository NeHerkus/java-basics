package lt.itacademy.java.basics;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Basics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt();
        out.println("Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data Academy 2024!");

        boolean b = true;
        byte o = 1;
        char w = 'w';
        char r = 'r';
        char d = 'd';
        char h = 'H';
        char sp = ' ';
        short s = 0;
        float f = 2.0f;
        int i = 3110;
        String line = "" + h + i + sp + w + s + r + o + d + sp + f + sp + b;
        out.println(line);
    }
}