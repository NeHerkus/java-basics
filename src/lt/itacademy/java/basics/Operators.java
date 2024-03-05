package lt.itacademy.java.basics;

public class Operators {
    public static void main(String[] args) {

         int side1 = 8;
         int side2 = 8;
         int side3 = 8;

        String triangleType = triangleType(side1, side2, side3);

        System.out.println("Triangle is " + triangleType);
    }

            public static String triangleType(int side1, int side2, int side3) {

            if (side1 == side2 && side2 == side3 && side1 == side3)
                return "Equilateral";

            else if (side1 == side2 && side2 == side3)
                return "Isosceles";

            else
                return "Scalene";
        }
    }

