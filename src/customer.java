import java.util.Scanner;

public class customer {
	
	public static customer[] customerlist = new customer[10];
	public static int index = 0;
	String stringid;
	int id;
	String firstname;
	String lastname;
	String email;
	String address;
	int phonenumber;
	
	public customer(customer cus) {
		this.id = cus.getId();
        this.firstname=cus.getFirstname();
        this.lastname=cus.getLastname();
        this.email = cus.getEmail();
        this.address = cus.getAddress();
        this.phonenumber = cus.getPhonenumber();
	}        
	
	public customer() {
		
	}
	
	public customer(int id, String firstname,String lastname, String email,String address,int phonenumber) {

		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.phonenumber = phonenumber;
		//System.out.println(id+firstname+lastname+email+address+phonenumber);
		}
	
	public int getId() {
		return id;
		}

	public String getFirstname() {
		return firstname;
		}
	
	public String getLastname() {
		return lastname;
		}
	
	public String getEmail() {
		return email;
		}
	
	public String getAddress() {
		return address;
		}
	
	public int getPhonenumber() {
		return phonenumber;
		}
	
	public static customer addnew()
	{
		String stringid;
		int id;
		String firstname;
		String lastname;
		String email;
		String address;
		String stringphone;
		int phonenumber;
		customer cus;
		Scanner sc = new Scanner(System.in);
		System.out.println("********************ADD NEW CUSTOMER PROCESS!******************** \n");
		System.out.println("Please enter the customer id: ");
		stringid = sc.nextLine();
		menu menu = new menu();
		id = menu.checkint2(stringid);
		System.out.println("Please enter the first name: ");
		firstname = sc.nextLine();
		System.out.println("Please enter the last name: ");
		lastname = sc.nextLine();
		System.out.println("Please enter the email name: ");
		email = sc.nextLine();
		System.out.println("Please enter the address name: ");
		address = sc.nextLine();
		System.out.println("Please enter the phone number name:");
		stringphone = sc.nextLine();
		phonenumber = menu.checkint2(stringphone);
		cus = new customer(id,firstname,lastname,email,address,phonenumber);
		
		System.out.println("THE CUSTOMER HAS BEEN ADDED!");
		System.out.println("***************************************");
		return cus;
	}
	
	public static void addCustomers(){

		if(index < 10 ) {
			customerlist[index] = new customer(addnew());
			index++;
		}

		else{
		System.out.println("THE ARRAY IS FULL!(MAXIUMUM IS 10 CUSTOMERS)\n" );
		}

	}
	
	public static void printCustomer() {
		try {
		boolean find = false;

		System.out.println("ID \t FIRSTNAME \t LASTNAME \t EMAIL \t ADDRESS \t TELEPHONE");
		System.out.println("*************************************************************");
		for(int i = 0; i < 10; i++) {
		System.out.println(customerlist[i].getId() + "\t" + customerlist[i].getFirstname() + "\t" + customerlist[i].getLastname() + "\t" + customerlist[i].getEmail() + "\t" + customerlist[i].getAddress() + "\t" + customerlist[i].getPhonenumber());		
		find = true; }
		if(find == false)
		System.out.println("The customer is not in this list." );
		System.out.println("***************************************************************\n\n");
		}
		catch(Exception e)
		{
			System.out.println("");
		}
		}
	
	public static void searchCustomer() {
		try {
		Scanner sc = new Scanner(System.in);
		String stringid;
		int id;
		boolean find = false;
		System.out.println("Please enter Customer Id:");
		stringid = sc.nextLine();
		menu menu = new menu();
		id = menu.checkint2(stringid);
		for(int i = 0; i < customerlist.length; i++) {
		if(customerlist[i].getId() == id) {
		System.out.println("ID \t FIRSTNAME \t LASTNAME \t EMAIL \t ADDRESS \t TELEPHONE");
		System.out.println("*************************************************************");
		System.out.println(customerlist[i].getId() + "\t	" + customerlist[i].getFirstname() + "\t	" + customerlist[i].getLastname() + "\t	   " + customerlist[i].getEmail() + "\t	   " + customerlist[i].getAddress() + "\t    " + customerlist[i].getPhonenumber());
		find = true;
		break;
		}
		}

		if(find == false)
		System.out.println("THE CUSTOMER IS NOT FOUND!" );
		

	}
	catch(Exception e)
	{
		System.out.println("THE CUSTOMER IS NOT FOUND!\n" );
	}
	}
}
