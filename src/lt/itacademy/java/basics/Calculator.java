package lt.itacademy.java.basics;

public class Calculator {
    public static void figuresCalculator(String figure, double... sides) {
        double perimeter = 0;
        double area = 0;
        String errorMessage = "";

        switch (figure.toLowerCase()) {
            case "triangle":
                if (sides.length != 3) {
                    errorMessage = "Triangle requires exactly 3 side lengths.";
                    break;
                }
                if (sides[0] <= 0 || sides[1] <= 0 || sides[2] <= 0) {
                    errorMessage = "Triangle side lengths must be positive.";
                    break;
                }
                double semiPerimeter = (sides[0] + sides[1] + sides[2]) / 2;
                area = Math.sqrt(semiPerimeter * (semiPerimeter - sides[0]) * (semiPerimeter - sides[1]) * (semiPerimeter - sides[2]));
                perimeter = sides[0] + sides[1] + sides[2];
                if (area <= 0.0) {
                    errorMessage = "Invalid triangle: the provided side lengths do not form a valid triangle.";
                }
                break;
            case "rectangle":
                if (sides.length != 2) {
                    errorMessage = "Rectangle requires exactly 2 side lengths.";
                    break;
                }
                if (sides[0] <= 0 || sides[1] <= 0) {
                    errorMessage = "Rectangle edge lengths must be positive.";
                    break;
                }
                perimeter = 2 * (sides[0] + sides[1]);
                area = sides[0] * sides[1];
                break;
            case "square":
                if (sides.length != 1) {
                    errorMessage = "Square requires exactly 1 side length.";
                    break;
                }
                if (sides[0] <= 0) {
                    errorMessage = "Square side length must be positive.";
                    break;
                }
                perimeter = 4 * sides[0];
                area = sides[0] * sides[0];
                break;
            default:
                errorMessage = "Invalid figure.";
        }

        if (!errorMessage.isEmpty()) {
            System.out.println(errorMessage);
        } else {
            System.out.println(figure + " perimeter is " + perimeter + " and area is " + area + ".");
        }
    }



    public static void main(String[] args) {
        figuresCalculator("Triangle", 1,1,2);

    }
}
