package Assignment;

import java.util.Date;

public class DateInSeconds {
	private Date today;
	
	public DateInSeconds() {
		
	}
	public void SetTime(Date today) {
		this.today=today;
	}
	
	public long getTime() {
		return today.getTime();
	}
}
