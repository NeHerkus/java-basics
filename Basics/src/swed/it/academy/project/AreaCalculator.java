package swed.it.academy.project;

public class AreaCalculator {
    public static void main(String[] args) {
        runCalculator();
    }

    private static void runCalculator() {
        talkToUser();
        outputResults();
    }

    private static void talkToUser() {
        IOManager.chooseShape();
        try {
            IOManager.inputData();
        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void outputResults() {
        Shape shape =
                switch (IOManager.getOption()) {
                    case 1 -> new Square(IOManager.getSide1());
                    case 2 -> new Triangle(IOManager.getSide1(), IOManager.getSide2());
                    case 3 -> new Circle(IOManager.getSide1());
                    default -> null;
                };
        if (shape != null) {
            shape.calculateArea();
            IOManager.showCalculation(shape.toString());
        }
    }

}



