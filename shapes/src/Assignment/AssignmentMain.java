package Assignment;
import java.util.Date;



public class AssignmentMain {
	
	public static void main(String[]args)
	{
		Circle circle1=new Circle(7.5);
		Circle circle2=new Circle(7.5);
		Rectangle rec1 = new Rectangle(7,2);
		
		//create a rectangle from another rectangle
		Rectangle rec2 = rec1.Rectangle(rec1);
		
		Square sqr1= new Square(12);
		CompareCircles cc1=new CompareCircles();
		boolean isSame;
		
		
	
		System.out.println("The area of the circle is : " +circle1.CalculateArea());
		System.out.println("its perimeter is : " + circle1.CalculatePerimeter());
		System.out.println("--------------------------------------------------");
		
		System.out.println("The area of the rectangle is : "+ rec1.findRectangleArea());
		System.out.println("Its perimeter is : "+rec1.findPerimeterOfRectangle());
		System.out.println("--------------------------------------------------");
		
		System.out.println("The area of the Square is : "+ sqr1.findSquareArea());
		System.out.println("Its perimeter is : " + sqr1.findPerimeterOfSquare());
		System.out.println("--------------------------------------------------");
		
		System.out.println("---------compare Circles-----------");
		
		isSame=cc1.compareCircles(circle1,circle2);
		if(isSame) {
			System.out.println("Circle 1 and 2 are the same");
		}else
		{
			System.out.println("Circle 1 and 2 are not the same");
		}
		
		System.out.println("The area of the rectangle is : "+ rec2.findRectangleArea());
		System.out.println("Its perimeter is : "+rec2.findPerimeterOfRectangle());
		System.out.println("--------------------------------------------------");
		
		Printer time=new Printer();
		Date today=new Date();
		time.print(today);
		
		System.out.println("--------------------------------------------------");
		DateInSeconds day1=new DateInSeconds();
		day1.SetTime(today);
		System.out.println("Time in mileseconds is "+ day1.getTime());
		
		
	}
	
}
