package lt.techin;

public class SimplifiedCircle {

    private double radius;

    public SimplifiedCircle() {
        this.radius = 1.0;
    }

    public SimplifiedCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        return radius * radius * Math.PI;
    }

    public double getCircumference(double radius) {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
