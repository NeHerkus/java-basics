import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        calculateHoursAndMinutesInOneYear(days);
    }

    static void calculateHoursAndMinutesInOneYear(int days) {
        int minutes = 0;
        int hours = 0;
        for (int i = 0; i < days; i++) {
            hours += 24;
            for (int j = 0; j<24; j++) {
                minutes+=60;
            }
        }
        System.out.printf("There are %d hours or %d minutes in one year", hours, minutes);
    }

}
