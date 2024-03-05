
void main() {
    calculateHrAndMinInYr();

}

void calculateHrAndMinInYr() {

    //as per task, assuming that the year is not a leap year

    int hrs = 0;
    int mins = 0;

    for (int i = 1; i <= 365; i++) {
        hrs+=24;
        mins+=1440;
    }

    System.out.printf("There are %d hours or %d minutes in one year.", hrs, mins);

}