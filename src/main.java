import java.util.Scanner;

public class main {
	 
		
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int mainmenuoption = 0;
	String start;
	int startint;
	System.out.println("Welcome to Customer Management application! \n");
	do {
	menu menu = new menu();
	menu.displaymenu();
	start = sc.nextLine();
	//check inputed value is int or not
	startint = menu.checkint(start);
	
	customer cus = new customer();
	
		switch(startint) {
			case 1 : {
				
				cus.addCustomers();
				mainmenuoption = 99;
			}break;
			case 2 : {
				cus.searchCustomer();		
				mainmenuoption = 99;			
						}break;
			case 3 : {
				cus.printCustomer();
				mainmenuoption = 99;
			}break;
			case 4 : {
					System.out.println("Are you sure you want to quit? Enter 0 to confirm, or other value to continue. ");
					String op = sc.nextLine();
					if(op.equals("0") == false) {
						System.out.println("**************************** ");
						System.out.println("YOU HAVE DECEIDED TO CONTINUE! \n");
						mainmenuoption = 99;
						
					}
					else {
						System.out.println("Thanks!Have a good day!");	
						mainmenuoption = 0;
				
			}break;
		
		}
	}
		
	}
	while (mainmenuoption != 0);
}
}	

