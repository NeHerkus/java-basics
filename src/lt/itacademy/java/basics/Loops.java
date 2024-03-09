
void main() {
    calculateHrAndMinInYr();
    calculateFactorial(5);
}

private void calculateHrAndMinInYr() {
    //as per task, assuming that the year is not a leap year
    int hrs = 0;
    int mins = 0;

    for (int i = 1; i <= 365; i++) {
        hrs += 24;
        mins += 1440;
    }
    System.out.printf("There are %d hours or %d minutes in one year.", hrs, mins);
}

private void calculateFactorial(int number) {
    int factorial = 1;

    for (int i = 1; i <= number; i++) {
        factorial *= i;
    }
    System.out.printf("\nFactorial of %d is %d.", number, factorial);
}
