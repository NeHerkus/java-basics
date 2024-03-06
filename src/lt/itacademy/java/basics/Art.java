package lt.itacademy.java.basics;
import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter height");
        int height = scanner.nextInt();

        for (int i = 1; i < height; i++) {
            for (int a = height-i; a > 0; a--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= 2 * i - 1; b++) {
                System.out.print("^");
            }
            System.out.println();
        }
        for (int i = height - 1; i > 0; i--) {
            System.out.print(" ");
        }
        System.out.println("^");
    }
}
