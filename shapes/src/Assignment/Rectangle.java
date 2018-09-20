package Assignment;

public class Rectangle {

		private double width;
		private double height;
		
	   
	   //default constructor
	   
	   public Rectangle(){}
	   
	   //loaded constructor
	   public Rectangle(double width, double height){
	   
	   this.width= width;
	   this.height= height;
	   }
	   
	 //create a rectangle from another ractangle
		  public  Rectangle Rectangle(Rectangle rec) {
			
			  
			   this.width =  rec.getWidth();
			   this.height= rec.getHeight();
			   
			   return this;
		}

	   
	   //getters 
	   public double getWidth(){
	   return this.width;}
	   
	   public double getHeight(){
	   return this.height;       
	   }
	   
	   
	   //setters
	   public void setWidth(int width){
	   this.width = width;
	   }
	   
	   public void setHeight(){
	   this.height= height;   
	   }
	   
	   
	   public  double findRectangleArea(){

	          double area = this.width*this.height;
	            return area;

	    }

	    public  double findPerimeterOfRectangle(){
	    
	    	double perimeter = 2*(this.width + this.height);
	    	return perimeter;
	    }

		
	   
	    

	   
}
