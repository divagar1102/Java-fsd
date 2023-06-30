package shapes;

public class Circle extends Shape{
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }
}
