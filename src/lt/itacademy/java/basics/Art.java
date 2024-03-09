package lt.itacademy.java.basics;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Art {
    public static void main(String[] args) {
        drawTree();
    }

    private static void drawTree() {
        Scanner scanner = new Scanner(in);
        out.print("Input: ");
        int height = Integer.parseInt(scanner.nextLine());
        scanner.close();
        out.println("Output: ");
        for (int i = 1; i <= height; i++) {
            int spaces = height - i;
            while (spaces > 0) {
                out.print(" ");
                spaces--;
            }
            int branches = i * 2 - 1;
            while (branches > 0) {
                out.print("#");
                branches--;
            }
            out.println();
        }
        int trunk = height;
        while (trunk > 1) {
            out.print(" ");
            trunk--;
        }
        out.print("#");
    }
}
