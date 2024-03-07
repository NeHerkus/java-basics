package swed.it.academy.project;

import java.math.BigDecimal;

public class Circle extends Shape{

        public Circle(double s1) {
            super(s1, s1);
        }

        @Override
        public void calculateArea() {
            rectangleArea();
            double circleArea = getArea() * Math.PI;
            BigDecimal area = new BigDecimal(circleArea);
            area = area.setScale(2, BigDecimal.ROUND_HALF_UP);
            setArea(area.doubleValue());
        }
}
