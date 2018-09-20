package Assignment;

public class CompareCircles {

	public boolean compareCircles(Circle c1, Circle c2) {
		boolean isSame=false;
			
			if(c1.getRadius()==c2.getRadius())
			{
				isSame=true;
			}
			
		return isSame;
	}
	

}
