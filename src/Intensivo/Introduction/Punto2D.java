package Intensivo.Introduction;

class Punto2D {
    private float x;
    private float y;

    public Punto2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }


    public double distance(Punto2D point) {
        float dx = this.x - point.getX();
        float dy = this.y - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    private class Circle {
        private float radius;
        private Punto2D center;

        public Circle(Punto2D center, float radius) {
            this.center = center;
            this.radius = radius;
        }

        public boolean contains(Punto2D point) {
            double distance = center.distance(point);

            if (distance <= radius) {
                return true;
            } else {
                return false;
            }
        }

    }
}
