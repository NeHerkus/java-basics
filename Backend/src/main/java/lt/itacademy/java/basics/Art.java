package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter tree height:");
        int height = scanner.nextInt();
        String spaces, hashtags;

        for (int i = 0; i < height; i++) {
            spaces = String.format("%" + (height - i) + "s", " ");
            hashtags = String.format("%" + (2 * i+1) + "s", " ").replace(" ","#");
            System.out.println(spaces + hashtags);
        }

        String trunkSpaces = String.format("%" + height + "s", "");
        System.out.println(trunkSpaces + "#");
    }
}