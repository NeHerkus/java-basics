package it.academy.java.basics;

import java.util.Scanner;

class Basics {
    public static void main(String[] args) {

        //Task 1

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.printf("Hello my name is %s %s and I am %d years old. I am attending IT & Data\n" +
                "Academy 2024!", name, surname, age);



        //Task 2

        char symbol1 = 'H';
        int symbol2  = 1330;
        char symbol3  = 'w';
        int symbol4  = 0;
        char symbol5  = 'r';
        int symbol6 = 1;
        char symbol7  = 'd';
        float symbol8 = 2.0f;
        boolean symbol9 = true;

        System.out.printf("\n%c%d %c%d%c%d%c %.1f %s\n", symbol1, symbol2, symbol3, symbol4,
                symbol5, symbol6, symbol7, symbol8, symbol9);


    }
}
