import java.util.Scanner;

public class menu {
	public void displaymenu() {
		System.out.println("Please choice the following options: \n");
		System.out.println("1. Adding a new customer!");
		System.out.println("2. Search a customer by his id!");
		System.out.println("3. Display the customers!");
		System.out.println("4. Exit the application!");
	}
	
	public int checkint(String start)
	{
		Scanner sc = new Scanner(System.in);
		Scanner check = new Scanner(start);
		
		while (check.hasNextInt() == false || (Integer.parseInt(start) > 4 || Integer.parseInt(start) <= 0)) {
			System.out.println("Please enter a valid option (Number from 1 to 4):");
			start = sc.nextLine();
			check = new Scanner(start);
		}	
		check.close();
		
		return Integer.parseInt(start);
	}
	
	public int checkint2(String start)
	{
		Scanner sc = new Scanner(System.in);
		Scanner check = new Scanner(start);
		
		while (check.hasNextInt() == false) {
			System.out.println("Please enter a valid number:");
			start = sc.nextLine();
			check = new Scanner(start);
		}	
		check.close();
		
		return Integer.parseInt(start);
	}
//	public int checkint(int start)
//	{
//		Scanner sc = new Scanner(System.in);
//		Scanner check = new Scanner(start);
//		
//		while (check.hasNextInt() == false || (Integer.parseInt(start) > 4 || Integer.parseInt(start) <= 0)) {
//			System.out.println("Please enter a valid option (Number from 1 to 4):");
//			start = sc.nextLine();
//			check = new Scanner(start);
//		}	
//		check.close();
//		
//		return Integer.parseInt(start);
//	}
}
