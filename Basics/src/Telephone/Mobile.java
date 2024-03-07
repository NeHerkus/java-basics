package Telephone;

public class Mobile extends Telephone{

    private String simNumber;
    private static int numberOfPhotos;
    public Mobile(String nr, String sim, int numberOfPhotos) {
        super(nr);
        this.simNumber = sim;
        Mobile.numberOfPhotos = numberOfPhotos;
    }
    public void takePhoto() {
        numberOfPhotos++;
    }
    public String getSimNumber() {
        return simNumber;
    }
    public int getNumberOfPhotos() {
        return numberOfPhotos;
    }
}
