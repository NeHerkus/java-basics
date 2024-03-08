package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets draw tree. Enter height: ");
        int height = Integer.parseInt(scan.nextLine());
        tree(height);
    }

    public static void draw(int number) {
        for (int i = 0; i < number; i++) {
            if (i > 0) {
                System.out.print("##");
            } else {
                System.out.print("#");
            }
        }
    }

    public static void empty(int number) {
        for (int i = number; i > 0; i--) {
            System.out.print(" ");
        }
    }

    public static void tree(int line) {

        for (int j = 1; j <= line; j++) {
            empty(line-j);
            draw(j);
            System.out.println();
        }
        empty(line-1);
        draw(1);
    }
}
