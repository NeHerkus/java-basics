package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    int a,b,c;

    public Operators(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//Task 5
       analyzeTriangle(scanner);
//Task 6
        analizeCarRide(scanner);
    }

    public static void analizeCarRide(Scanner scanner){
        double distance;
        double currFuel;
        double fuelUsage;
        double fuelPrice;
        double requiredFuel;
        System.out.println("Enter distance, current fuel amount, fuel usage for 100km, and price: ");

        distance = Double.parseDouble(scanner.next());
        currFuel = Double.parseDouble(scanner.next());
        fuelUsage = Double.parseDouble(scanner.next());
        fuelPrice = Double.parseDouble(scanner.next());
        requiredFuel = distance*fuelUsage/100;

        if(distance < (100* currFuel)/fuelUsage){
            double leftFuel = currFuel-requiredFuel;
            System.out.println("Destination is in "+ distance +
                    ". Car is able to reach the destination. It will have "+ leftFuel +" liters of fuel left.");
        }else {
            double neededFuel = requiredFuel - currFuel;
            double price = neededFuel*fuelPrice;
            System.out.println("Destination is in " + distance
                    + ". Car is not able to reach the destination. It needs "
                    + neededFuel+ " liter of fuel more. It will cost " + price+ ".");
        }

    }

    public static void analyzeTriangle(Scanner scanner){
        int aSide;
        int bSide;
        int cSide;
        System.out.println("Enter trinagle's sides: ");
        aSide = scanner.nextInt();
        bSide = scanner.nextInt();
        cSide = scanner.nextInt();

        Operators op = new Operators(aSide,bSide,cSide);

        if(!op.isValid()){
            System.out.println("Triangle is invalid. Sides : " + op.a + op.b + op.c);
        }else if(op.isEquilateral()){
            System.out.println("Triangle is Equilateral. Sides : " + op.a + op.b + op.c);
        }else if(op.isIsosceles()){
            System.out.println("Triangle is Isosceles. Sides : " + op.a + op.b + op.c);
        }else if(op.isScalene()){
            System.out.println("Triangle is Scalene. Sides : " + op.a + op.b + op.c);
        }
    }


    public boolean isEquilateral(){
        return a==b && b==c;
    }
    public boolean isIsosceles(){
         return a==b || b==c || a==c;
    }
    public boolean isScalene(){
        return a!=b && b!=c;
    }
    public boolean isValid(){
        return a + b > c && a + c > b && b + c > a;
    }
}
