package lt.itacademy.java.basics;

public class Loops {

    public static void main(String[] args) {

        int input = 365;

        String yearsToHoursFor = yearConverterFor(input);
        System.out.println(yearsToHoursFor);

        String yearsToHoursWhile = yearConverterWhile(input);
        System.out.println(yearsToHoursWhile);
    }

    static String yearConverterFor(int days) {

        int hours = 0;
        int minutes = 0;

        for (int i = 1; i <= days; i++) {

            hours = hours + 24;
            minutes = minutes + (24 * 60);

        }

        return """
                There are %d hours and %d minutes in one year
                """.formatted(hours, minutes);
    }

    static String yearConverterWhile(int input) {

        int hours = 0;
        int minutes = 0;

        while (input >= 1) {

            hours = hours + 24;
            minutes = minutes + (24 * 60);
            input--;
        }

        return """
                There are %d hours and %d minutes in one year
                """.formatted(hours, minutes);
    }
}
