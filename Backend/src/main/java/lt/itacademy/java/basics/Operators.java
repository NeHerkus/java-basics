package lt.itacademy.java.basics;

import java.util.*;



public class Operators {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Dictionary<Double,String> string_dict= new Hashtable<>();
        string_dict.put(1.0,"Equilateral");
        string_dict.put(2.0,"Isosceles");
        string_dict.put(3.0,"Scalene");

        ArrayList<Double> Triangle = new ArrayList<>();

        Triangle.add(Double.valueOf(scanner.next()));
        Triangle.add(Double.valueOf(scanner.next()));
        Triangle.add(Double.valueOf(scanner.next()));

        double string_dict_key = determineTriangleType(Triangle);

        System.out.println("Triangle is : " + string_dict.get(string_dict_key));

        scanner.close();

    }
    public static double determineTriangleType(ArrayList<Double> triangle_values){


        double num1 = Collections.frequency(triangle_values, triangle_values.get(0));
        double num2 = Collections.frequency(triangle_values, triangle_values.get(1));
        double num3 = Collections.frequency(triangle_values, triangle_values.get(2));

        return Math.max(num1,Math.max(num2,num3));
    }

}
