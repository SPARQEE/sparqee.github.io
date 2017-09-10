public class Rectangle implements Shape{
	//We will represent our rectangle using the left bottom
	// and then we can compute the other corners.
	private double x_low, y_low, length, height;
	
	public Rectangle(double x_low, double y_low, double length, double height) {
		this.x_low= x_low;
		this.y_low= y_low;
		this.length= length;
		this.height= height;
	}
	
	public double area() {
		return length*height;
	}
	
	public double perimeter() {
		return 2*(length+ height);
	}
	
	public double diagonal() {
		return 5;
	}
}