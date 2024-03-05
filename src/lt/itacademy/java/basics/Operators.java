package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] edges = scanner.nextLine().split(" ");

        triangleDetermination(Integer.valueOf(edges[0]), Integer.valueOf(edges[1]), Integer.valueOf(edges[2]));
    }

    static void triangleDetermination(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if(a == b && a == c) {
                System.out.println("Triangle is Equilateral. Sides: " + a + " " + b + " " + c);
                return;
            } else if (a == b || a == c || c == b) {
                System.out.println("Triangle is Isosceles. Sides: " + a + " " + b + " " + c);
                return;
            } else {
                System.out.println("Triangle is Scalene. Sides: " + a + " " + b + " " + c);
                return;
            }
        }

        System.out.println("Triangle is invalid. Sides: " + a + " " + b + " " + c);
    }
}
