
public class Appointment extends Customer{

	public String date;
	public String time;
	public String customerName;
	
	public Appointment (String date, String time, String customerName){
		super(customerName);
		this.date = date;
		this.time = time;
		//this.time = customerName;
	}
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
	
	
	

}
