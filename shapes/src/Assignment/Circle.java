package Assignment;

public class Circle {
	private double radius;
	
	public Circle() {}
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	//calculate and return circles area
	public  double CalculateArea()
	{
		return (Math.PI) * (Math.pow(this.radius,2));
	}
	
	//claculate and return perimeter of a circle 
	public double CalculatePerimeter() 
	{
		return 2* (Math.PI) *this.radius;
	}
		
}
