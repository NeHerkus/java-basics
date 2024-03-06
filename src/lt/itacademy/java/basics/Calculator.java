package lt.itacademy.java.basics;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("Enter figure (triangle, rectangle or square)");
            String figure = scanner.nextLine();
            double perimeter = 0;
            double area = 0;

            switch (figure) {
                case "triangle":
                System.out.println("Enter measurements");
                int first = scanner.nextInt();
                int sec = scanner.nextInt();
                int third = scanner.nextInt();

                if (first <= 0 || sec <= 0 || third <= 0) {
                    System.out.println("Triangle edge length can’t be 0.");
                } else if (first + sec <= third || first + third <= sec || sec + third <= first) {
                    System.out.println("Triangle measurements are not possible.");
                } else {
                    perimeter = first + sec + third;
                    float s = (float) perimeter / 2;
                    area = Math.sqrt(s * (s - first) * (s - sec) * (s - third));
                }
                break;
                case "rectangle":
                    System.out.println("Enter 2 params for measurements");
                    int length = scanner.nextInt();
                    int height = scanner.nextInt();
                    if (length <= 0 || height <= 0 ) {
                        System.out.println("Rectangle edge length can’t be 0.");
                    } else {
                        perimeter = (length + height) * 2;
                        area = length * height;
                    }
                break;
                case "square":
                    System.out.println("Enter 1 param for measurements");
                    int edge = scanner.nextInt();
                    if (edge <= 0) {
                        System.out.println("Square edge length can’t be 0.");
                    } else {
                        perimeter = edge * 4;
                        area = Math.pow(edge, 2);
                    }
                    break;
                default:
                    System.out.println("Invalid shape");
            }
            System.out.printf("""
                        %s perimeter is %s and area is %s.
                        """, figure, perimeter, area);
            System.out.println("Do you want to continue (yes/no)?");
            String choice = scanner.next();
            scanner.nextLine();
            continueProgram = choice.equalsIgnoreCase("yes");
        }
        scanner.close();
        System.out.println("Scanner closed!");
    }
}
