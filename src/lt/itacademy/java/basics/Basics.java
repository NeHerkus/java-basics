package lt.itacademy.java.basics;

public class Basics {
    public static void main(String[] args) {

        String name = "Gabija";
        String surname = "Sabeckyte";
        byte lbyte = 3;
        int age = 23;
        short lshort = 1;
        float lfloat = 1.0f;
        char lchar = 'G';
        boolean lbool = true;
        String lOutput = lchar+lbyte+lshort+age+name+' '+lbool;
        System.out.println(lOutput);

        System.out.println("Hello my name is " + name + " " + surname + " and I'm " + age + " years old. I am attending IT & Data\n" +
                "Academy 2024!");

    }

}
