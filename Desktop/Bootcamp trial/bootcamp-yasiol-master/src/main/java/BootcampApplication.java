import java.util.ArrayList;
import java.util.List; 

//an array list is a list. list is an interface. arraylist 
							// Implements array interface


public class BootcampApplication {

	public static void main(String[] args) {

		Triangle testTriangle = new Triangle(1, 2, 3, 4, 5, 6);
		System.out.println("The area of testTriangle is " + testTriangle.area());

		List<Shape> shapes = new ArrayList<Shape>();

		for (int i = 0; i < 5; i++) {
			shapes.add(new Triangle(0, 0, i + 1, 0, 0, i + 1));
			//shapes.add(new Rectangle(0.0 , i*i, i + 1, i+1, 10);
		}
		System.out.println("There are now " + shapes.size() + " shapes in the shapes list.");

		double totalArea = 0.;
		for (Shape shape : shapes) {
			totalArea += shape.area();
		}
		System.out.println("The total area of the shapes is " + totalArea);

	}

}
