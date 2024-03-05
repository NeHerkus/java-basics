package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String surname = sc.nextLine();
        int years = sc.nextInt();

        System.out.println("Hello my name is " + name + " " + surname + " and I am " + years + " ayears old. I am attending IT & Data Academy 2024!");
    }
}
