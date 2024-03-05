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
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        Operators op = new Operators(a,b,c);

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
