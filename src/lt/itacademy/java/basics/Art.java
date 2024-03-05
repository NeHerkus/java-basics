package lt.itacademy.java.basics;

public class Art {
    public static void draw(int h) {
        for (int i = 0; i < h; i++) {
            System.out.print(" ".repeat(h - i - 1));

            System.out.println("#".repeat(2 * i + 1));
        }
        System.out.println(" ".repeat(h - 1) + "#");
    }

    public static void main(String[] args) {
        draw(16);
    }
}
