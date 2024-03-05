package lt.itacademy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the figure, length and width: ");
        String figureType = scanner.next();
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        switch (figureType) {
            case "Rectangle":

                break;
            case "Triangle":

                break;
            case "Square":

                break;
        }
    }
}
