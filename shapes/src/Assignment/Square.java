package Assignment;

public class Square {
	private double length;
	
	public Square() {}
	public Square(double length) {
		this.length=length;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
	public  double findSquareArea(){

        double area = this.length*this.length;
        return area;
        }

	public  double findPerimeterOfSquare(){

	double perimeter = 4*(this.length);
	return perimeter;
	}

	//For Question 6 
	public void compareArea(Object object) {
		double diff,thisArea , objectArea;
		
		if (object instanceof Circle) {
			Circle circle=(Circle) object;
			thisArea=this.findSquareArea() ;
			objectArea=circle.CalculateArea();
			
			if(thisArea==objectArea) {
				System.out.print("Area are the same");
			}
			else if(thisArea!=objectArea) {
				diff=thisArea-objectArea;
				System.out.print("Areas of the shapes are different by "+diff);
			}
			
		}
		else if(object instanceof Rectangle) {
			Rectangle rectangle=(Rectangle) object;
			thisArea=this.findSquareArea() ;
			objectArea=rectangle.findRectangleArea();
			
			if(thisArea==objectArea) {
				System.out.print("Area are the same");
			}
			else if(thisArea!=objectArea) {
				diff=thisArea-objectArea;
				System.out.print("Areas of the shapes are different by "+diff);
			}
			
		}
		
	}
}
