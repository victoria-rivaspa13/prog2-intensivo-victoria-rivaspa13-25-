package Intensivo.Introduction;

class Circle {
    private double centerX;
    private double centerY;
    private double radius;

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public double[] center() {
        return new double[]{centerX, centerY};
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public boolean contains(double x, double y) {
        double distanceSquared = (x - centerX) * (x - centerX) + (y - centerY) * (y - centerY);
        return distanceSquared <= radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
