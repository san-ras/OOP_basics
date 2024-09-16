package lt.techin;

public class Rectangle {

    private float width;

    private float length;

    public Rectangle() {
        this.width = 1.0f;
        this.length = 1.0f;
    }

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
