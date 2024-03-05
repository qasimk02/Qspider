import java.util.*;

class Customer{
	String cName;
	String cDep;
	float cHeight;
	
	Customer(String cName,String cDep,float cHeight){
		this.cName = cName;
		this.cDep = cDep;
		this.cHeight = cHeight;
	}
	
	public void printCustomerDetails(){
		System.out.println("--------Customer Details-----------");
		System.out.println("Customer Name: "+cName);
		System.out.println("Customer Deparatment: "+cDep);
		System.out.println("Customer Height: "+cHeight);
		System.out.println("-----------------------------------");
	}
}

class Main{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer1 Name: ");
		String name1 = sc.nextLine();
		System.out.println("Enter Customer1 Deparatment: ");
		String dep1 = sc.nextLine();
		System.out.println("Enter Customer1 Height: ");
		float height1 = sc.nextFloat();
		Customer c1 = new Customer(name1,dep1,height1);
		
		sc.nextLine();
		
		System.out.println("Enter Customer2 Name: ");
		String name2 = sc.nextLine();
		System.out.println("Enter Customer2 Deparatment: ");
		String dep2 = sc.nextLine();
		System.out.println("Enter Customer2 Height: ");
		float height2 = sc.nextFloat();
		Customer c2 = new Customer(name2,dep2,height2);

		c1.printCustomerDetails();
		c2.printCustomerDetails();
		
	}

}