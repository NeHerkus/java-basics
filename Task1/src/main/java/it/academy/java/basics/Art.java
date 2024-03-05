package it.academy.java.basics;

import java.util.Scanner;

public class Art {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int maxLength = 1;
        for (int i = 0; i < input - 1; i++) {
            maxLength += 2;
        }


        for(int i=3; i>=input; i--) {
            String space = " ";
            String line = space.repeat(maxLength);
            line[i] = "#" ;

        }
    }
}
