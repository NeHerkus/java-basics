package swed.it.academy.project;

public class Square extends Shape{

    public Square(double s1) {
        super(s1, s1);
    }

    @Override
    public void calculateArea() {
        rectangleArea();
    }
}
