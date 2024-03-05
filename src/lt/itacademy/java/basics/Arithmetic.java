package lt.itacademy.java.basics;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter measurement:");

        int measurement = scanner.nextInt();

        int volume = measurement * measurement * measurement;
        int perimeter = measurement * 2 * 6;

        System.out.println("Cube’s volume: " + volume + "cm3");
        System.out.println("Cube’s perimeter: " + perimeter + "cm");

        System.out.println("Enter feet and inches:");

        float ftValue = scanner.nextFloat();
        float inValue = scanner.nextFloat();
        double cmValue = ftValue * 12 * 2.54 + inValue * 2.54;

        System.out.println(cmValue);

    }
}
