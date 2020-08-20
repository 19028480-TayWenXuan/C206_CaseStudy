import java.util.ArrayList;

public class BikeShop {
	

	private static ArrayList<Customer> customerArrayList;
	private static Customer customer;
	private static ArrayList<Bike> bikeList;
	private static Bike bike;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
		 ArrayList<Bike> bikeList = new ArrayList<Bike>();
		int option = 0;

		while (option != 6) {
			showMainMenu();
			option = Helper.readInt("Enter option > ");

			// menu for member 2
			if (option == 1) {
				Helper.line(20, "-");
				System.out.println("View Bike");
				ShowBikeMenu();
				int choice = Helper.readInt("Enter your choice > ");
				if(choice == 1) {
					BikeShop.addBike(bikeList);
				} else if(choice == 2) {
					BikeShop.viewAllBike(bikeList);
				} else if(choice == 3) {
					BikeShop.delBike(bikeList);
				}
				
			}
			
			else if(option == 2) {
				Helper.line(20, "-");
				System.out.println("View Bike Parts");
				
				
				
				
				
				
				
				
				
		}
			
			else if (option == 3) {
				Helper.line(20, "-");
				System.out.println("Book Appointment");
				
				
				
				
				
				
				
				
				
				
				
		}
			
			else if(option == 4) {
				Helper.line(20, "-");
				System.out.println("View Appointment");
				
				
				
				
				
				
				
				
				
				
		}
			//menu for member1
			else if(option == 5) {
				ShowCustomerMenu();
				int choice = Helper.readInt("Enter your choice:");
				if (choice == 1) {
					BikeShop.addCustomer(customerArrayList);
				}
				else if(choice == 2) {
					BikeShop.viewAllCustomer(customerArrayList);
				}
				else if(choice == 3) {
					BikeShop.delCustomer(customerArrayList);
				}
			}
		}
	}
				
	//member1 delete method
	 public static void delCustomer(ArrayList<Customer> customerArrayList) {
		 String name = Helper.readString("Enter name:");
		 for(int i =0; i<customerArrayList.size();i++) {
		 if(customerArrayList.get(i).getName() != null) {
		      customerArrayList.remove(i);
		      System.out.println("Customer deleted!");
		 }
		 else {
		      System.out.println("Customer does not exist!");
		 }
		 }
		 
	 }
		
	 //member1 view the list of buyer's information
	private static void viewAllCustomer(ArrayList <Customer> customer) {
		// TODO Auto-generated method stub
		System.out.println(String.format("%-20s %-20s %-20s\n", "NAME", "EMAIL", "PHONE"));
		for (int i = 0; i < customer.size(); i++) {
			if (customer.isEmpty() == false) {
				System.out.println( String.format("%-20s %-20s %-20s\n", customer.get(i).getName(), customer.get(i).getEmail(), customer.get(i).getPhone()));

			}
		}
		
	}
	
	//member1 create (add) buyer's personal info
	public static void addCustomer(ArrayList<Customer> customer) {
		String name = Helper.readString("Enter name > ");
		String email = Helper.readString("Enter email > ");
		String phone = Helper.readString("Enter phone > ");
		customer.add(new Customer(name,email,phone));
		System.out.println("Customer added");
	}
	
	//member1 customerMenu
	private static void ShowCustomerMenu() {
		// TODO Auto-generated method stub
		  System.out.println("1. Add New customer");
		    System.out.println("2. View All customer");
		    System.out.println("3. Delete customer");
	}
	
	// member 2 create (add) bike info method
	public static void addBike(ArrayList<Bike> bike) {
		String model = Helper.readString("Enter model > ");
		String description = Helper.readString("Enter description > ");
		Boolean isAvailable = Helper.readBoolean("Available or not > ");
		bike.add(new Bike(model,description, isAvailable));
		System.out.println("Bike added!");
	}
	
	// member 2 view the list of Bike's Information
	public static void viewAllBike(ArrayList<Bike> bike) {
		System.out.println(String.format("%-20s %-20s %-20s\n", "MODEL", "DESCRIPTION", "AVAILABILITIES"));
		for(int i = 0; i < bike.size(); i++) {
			if(bike.isEmpty() == false) {
				System.out.println(String.format("%-20s %-20s %-20b\n", bike.get(i).getModel(), bike.get(i).getDescription(), bike.get(i).isAvailable()));
			}
		}
	}
	
	// member 2 delete Bike method
	public static void delBike(ArrayList<Bike> bikeList) {
		String model = Helper.readString("Enter model: ");
		for(int i = 0; i < bikeList.size(); i++) {
			if(bikeList.get(i).getModel() != null) {
				bikeList.remove(i);
				System.out.println("Bike deleted!");
			} else {
				System.out.println("Bike does not exist!");
			}
		}
	}
	
	// member 2 Bike Menu
	private static void ShowBikeMenu() {
		System.out.println("1. Add New Bike");
		System.out.println("2. View All Bike");
		System.out.println("3. Delete Bike");
	}
	
	//main menu
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
