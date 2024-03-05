package lt.itacademy.java.basics;
import java.util.*;

class Main {
    public static void main(String[] args) {

        // TASK 1
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your surname: ");
        String surname = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello my name is " + name + " " + surname + " and I am " + age + " years old. I am attending IT & Data Academy 2024!");

        // TASK 2

        int intas = 31;
        byte byteas = 10;
        String stringas = "w0r1d";
        char charas = 'H';
        boolean boolas = true;
        float floatas = 2.0f;

        System.out.println("" + charas + intas + byteas + " " + stringas + " " + floatas + " " + boolas);

    }
}