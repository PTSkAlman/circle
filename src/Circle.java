public class Circle {

    private double radius;
    private double area;
    private double circumference;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        this.area = radius*radius*Math.PI;
        return area;
    }

    public double getCircumference() {
        this.circumference = radius*2*Math.PI;
        return circumference;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
