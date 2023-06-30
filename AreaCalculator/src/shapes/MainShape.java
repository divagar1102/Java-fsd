package shapes;
import java.util.ArrayList;
public class MainShape {        //Main function to call out child programs
	public static void main(String[] args) {
        ArrayList<Shape> shapesList = new ArrayList<>();

        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(5);

        shapesList.add(rectangle);
        shapesList.add(circle);

        try {
            for (Shape shape : shapesList) {
                shape.calculateArea();
                shape.displayArea();
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Calculation completed.");
        }
    }
}
