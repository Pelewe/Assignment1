package Assignment;

public class CopyReactangle {
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public CopyReactangle(){}
	   
	   //loaded constructor
	   public CopyReactangle(double width, double height){
	   
	   this.width= width;
	   this.height= height;
	   }
	//create a rectangle from another ractangle
	  public  CopyReactangle Rectangle(CopyReactangle rec) {
		// TODO Auto-generated constructor stub
		  
		   this.width =  rec.getWidth();
		   this.height= rec.getHeight();
		   
		   return this;
	}
	
}
