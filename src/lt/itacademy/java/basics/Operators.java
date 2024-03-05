package lt.itacademy.java.basics;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle measurements: ");
        int firstMeas = scanner.nextInt();
        int secMeas = scanner.nextInt();
        int thirdMeas = scanner.nextInt();

        if (firstMeas <= 0 || secMeas <= 0 || thirdMeas <= 0 ||
                firstMeas + secMeas <= thirdMeas || firstMeas + thirdMeas <= secMeas || secMeas + thirdMeas <= firstMeas) {
            System.out.println("Triangle is invalid. Sides: " + firstMeas + " " + secMeas + " " + thirdMeas);
        } else if (firstMeas == secMeas && secMeas == thirdMeas) {
            System.out.println("Triangle is Equilateral. Sides: " + firstMeas + " " + secMeas + " " + thirdMeas);
        } else if (firstMeas == secMeas || secMeas == thirdMeas || firstMeas == thirdMeas) {
            System.out.println("Triangle is Isosceles. Sides: " + firstMeas + " " + secMeas + " " + thirdMeas);
        } else {
            System.out.println("Triangle is Scalene. Sides: " + firstMeas + " " + secMeas + " " + thirdMeas);
        }

        System.out.printf("""
                Triangle is Scalene. Sides: %s %s %s
                """, firstMeas, secMeas, thirdMeas);
    }
}
