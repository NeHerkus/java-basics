package lt.itacademy;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the tree height:");
        int height = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            int j = height - i;
            stringBuilder.append(" ".repeat(j));
            stringBuilder.append("#".repeat(1 + i * 2));
            stringBuilder.append("\n");
        }

        stringBuilder.append(" ".repeat(height)).append("#");

        System.out.println(stringBuilder);
        scanner.close();
    }
}
