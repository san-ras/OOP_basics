package lt.techin;

public class TestCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle(3.0, "green");
        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea());

        Circle c4 = new Circle();
        c4.setRadius(1.2);
        System.out.println("The circle has radius of " + c4.getRadius() + " and area of " + c4.getArea());
        c4.setColor("blue");
        System.out.println("The circle's color is " + c4.getColor());

        Circle c5 = new Circle(5);
        System.out.println(c5.toString());
        System.out.println(c5);

        Time time = new Time(0, 59, 59);
        System.out.println(time);
        time.nextSecond();
        System.out.println(time);
    }
}
