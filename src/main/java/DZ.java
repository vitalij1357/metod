public class DZ {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape ellipse = new Ellipse();


        ShapePrinter printer = new ShapePrinter();


        printer.printShapeName(circle);
        printer.printShapeName(rectangle);
        printer.printShapeName(square);
        printer.printShapeName(triangle);
        printer.printShapeName(ellipse);

    }
}
abstract class Shape {
    public abstract String getName();

}
class Circle extends Shape {
    @Override
    public String getName() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    @Override
    public String getName() {
        return "Rectangle";
    }
}

class Square extends Shape {
    @Override
    public String getName() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String getName() {
        return "Triangle";
    }
}

class Ellipse extends Shape {
    @Override
    public String getName() {
        return "Ellipse";
    }
}


class ShapePrinter {
    public void printShapeName(Shape shape) {
        System.out.println("Shape name: " + shape.getName());
    }
}




