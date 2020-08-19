public class BikeShop {
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub

			}
			
			public static void showMainMenu() {
				BikeShop.setHeader("Main Menu");
				System.out.println("View Bike");
				System.out.println("View Bike Parts");
				System.out.println("Book Appointment");
				System.out.println("View Appointment");
				System.out.println("Quit");
				
				System.out.println("Buyer's information"); 
			}

			private static void setHeader(String header) {
				Helper.line(80, "-");
				System.out.println(header);
				Helper.line(80, "-");
				
			}

		}
	

		
