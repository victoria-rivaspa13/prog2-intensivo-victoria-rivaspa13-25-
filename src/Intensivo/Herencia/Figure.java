package Intensivo.Herencia;

abstract class Figure {
    abstract boolean contains(Point2D point);
}

class Point2D {
    double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Figure {
    double x, y, width, height;

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    boolean contains(Point2D point) {
        return point.x >= x && point.x <= x + width && point.y >= y && point.y <= y + height;
    }
}

class Triangle extends Figure {
    Point2D a, b, c;

    public Triangle(Point2D a, Point2D b, Point2D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double area(Point2D p1, Point2D p2, Point2D p3) {
        return Math.abs((p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2.0);
    }

    @Override
    boolean contains(Point2D point) {
        double totalArea = area(a, b, c);
        double area1 = area(point, b, c);
        double area2 = area(a, point, c);
        double area3 = area(a, b, point);
        return Math.abs(totalArea - (area1 + area2 + area3)) < 1e-9;
    }
}

class Circle extends Figure {
    double x, y, radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    boolean contains(Point2D point) {
        return Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2) <= Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}

class Square extends Rectangle {
    public Square(double x, double y, double side) {
        super(x, y, side, side);
    }
}
//class FigureTest{
//    public static void main(String[] args) {
//        List<Figure> figures = new ArrayList<>(2);
//        figures.add(new Rectangle(0, 0, 10, 5));
//        figures.add(new Circle(5, 5, 3));
//        figures.add(new Triangle(new Point2D(0, 0), new Point2D(5, 0), new Point2D(2.5, 5)));
//        figures.add(new Square(2, 2, 4));
//
//        Point2D testPoint = new Point2D(3, 3);
//
//        for (Figure figure : figures) {
//            System.out.println("El punto " + testPoint.x + ", " + testPoint.y + (figure.contains(testPoint) ? " está dentro" : " no está dentro"));
//        }
//
//        for (Figure figure : figures) {
//            if (figure instanceof Circle) {
//                System.out.println("Radio del círculo: " + ((Circle) figure).getRadius());
//            }
//        }
//    }
//}