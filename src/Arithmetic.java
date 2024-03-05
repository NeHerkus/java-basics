import java.sql.SQLOutput;
import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        task 3
//        float side = scanner.next();
//        System.out.println("Calculate cube volume and perimeter based on side of length " + side );
//
//        float volume = calculateCubeVolume(side);
//        System.out.printf("Volume of cube is: %.3f cm^3\n", volume);
//        float perimeter = calculateCubePerimeter(side);
//        System.out.printf("Perimeter of cube is: %.3f cm\n", perimeter);


//        task 4
        float feet = scanner.nextFloat();
        float inches = scanner.nextFloat();

        System.out.printf("%.2f feet and %.2f inches = %.3f",
                feet, inches, feetAndInchesToCm(feet, inches));


    }

    static float calculateCubeVolume(float side) {
        return side*side*side;
    }
    static float calculateCubePerimeter(float side) {
        return side * 12;
    }



    static float feetAndInchesToCm(float feet, float inches) {

        return (float) ((12 * feet + inches) *2.54);
    }

}
