package org.example;
import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number.");
        int number = Integer.parseInt(scanner.next());

        int space = number-1;
        int tree = 1;
        for(int i=0;i<number;i++) {
            for(int xx=0;xx<space;xx++) System.out.printf(" ");
            for(int x=0;x<tree;x++) System.out.printf("#");
            tree=tree+2;
            space--;
            System.out.printf("\n");
        }
        for(int i=0;i<number-1;i++) System.out.printf(" ");
        System.out.printf("#");
    }
}
