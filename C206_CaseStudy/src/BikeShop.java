public class BikeShop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void showMainMenu() {
		BikeShop.setHeader("Main Menu");
		System.out.println("1. View Bike");
		System.out.println("2. View Bike Parts");
		System.out.println("3. Book Appointment");
		System.out.println("4. View Appointment");
		System.out.println("5. Buyer's information");
		System.out.println("6. Quit");
		
		
	}

	private static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
		
	}

}
		
	

		
