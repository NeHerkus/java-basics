package lt.itacademy.java.basics;

public class Basics {
    public static void main(String[] args) {

        byte lbyte = 3;
        short lshort = 1;
        int lint = 1;
        float lfloat = 2.0f;
        char lchar = 'H';
        boolean lbool = true;
        String lstring = " w0r1d ";
        String task2 = lchar + lbyte + lshort + lint + lstring + lfloat + ' ' + lbool;
        System.out.println(task2);

        String name = "Gabija";
        String surname = "Sabeckyte";
        int age = 23;
        System.out.println("Hello my name is " + name + " " + surname + " and I'm " + age + " years old. I am attending IT & Data\n" +
                "Academy 2024!");
    }
}
