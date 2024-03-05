import java.sql.SQLOutput;

public class Arithmetic {

    public static void main(String[] args) {
        float side = 5f;
        System.out.println("Calculate cube volume and perimeter based on side of length " + side );

        float volume = calculateCubeVolume(side);
        System.out.printf("Volume of cube is: %.3f cm^3\n", volume);
        float perimeter = calculateCubePerimeter(side);
        System.out.printf("Perimeter of cube is: %.3f cm\n", perimeter);


    }

    static float calculateCubeVolume(float side) {
        return side*side*side;
    }
    static float calculateCubePerimeter(float side) {
        return side * 12;
    }
}
