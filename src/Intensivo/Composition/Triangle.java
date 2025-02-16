package Intensivo.Composition;

//import Intensivo.Line;
//import Intensivo.Point;

//class Triangle {
//    Line l1, l2, l3;
//    Point p1, p2, p3;
//
//    // constructor para definir un triángulo con tres puntos
//    Triangle(Point p1, Point p2, Point p3) {
//        this.p1 = p1;
//        this.p2 = p2;
//        this.p3 = p3;
//        l1 = new Line(p1, p2);
//        l2 = new Line(p2, p3);
//        l3 = new Line(p3, p1);
//    }
//
//    double perimeter() {
//        return l1.length() + l2.length() + l3.length();
//    }
//
//    double area() {
//        double base = l1.length();
//        double altura = Math.abs(p3.y - p1.y);
//        return (base * altura) / 2;
//    }
//
//    boolean isEquilateral() {
//        double a = l1.length();
//        double b = l2.length();
//        double c = l3.length();
//        return a == b && b == c;
//    }
//
//
//    boolean isIsosceles() {
//        double a = l1.length();
//        double b = l2.length();
//        double c = l3.length();
//        return a == b || b == c || c == a;
//    }
//
//
//    boolean isScalene() {
//        double a = l1.length();
//        double b = l2.length();
//        double c = l3.length();
//        return a != b && b != c && c != a;
//    }
//}
