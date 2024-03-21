import java.util.Scanner;

class Customer{
	String name;
	String address;
	long mobileNumber;
	String gender;
	Customer(String name,String address,long mobileNumber,String gender){
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}
	
	@Override
	public String toString(){
		return super.toString()+"[ {Name: " +name+ "},{Address: "+address+"},{Mobile Number: "+mobileNumber+"},{Gender: "+gender+"}]";
	}
	
	@Override
	public boolean equals(Object obj){
		Customer ref = (Customer)obj;//upcasting
		System.out.println(this.name+" "+ref.name);
		return this.name.equals(ref.name);
	}
	
	@Override
	public int hashCode(){
		return (int)mobileNumber;
	}
	
}

class Driver2{
	
	public static String genderInput(Scanner sc){
		System.out.println("Choose Gender: ");
		System.out.println("Enter 1 for MALE");
		System.out.println("Enter 2 for FEMALE");
		System.out.println("Enter 3 for OTHERS");
		int option = sc.nextInt();
		String gender = "";
		switch(option){
			case 1:
				gender = "MALE";
				break;
			case 2:
				gender = "FEMALE";
				break;
			case 3:
				gender = "OTHERS";
				break;
			default:
				System.err.println("Choose form available option");
				genderInput(sc);
				break;
		}
		return gender;
	}
	public static Customer createCustomer(int cNumber){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer "+cNumber+" details");
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Address: ");
		String address = sc.nextLine();
		System.out.print("Enter Mobile Number: ");
		long mobileNumber = sc.nextLong();
		String gender = genderInput(sc);
		
		return new Customer(name,address,mobileNumber,gender);
	}
	public static void main(String args[]){
		
		Customer c1 = createCustomer(1);
		Customer c2 = createCustomer(2);
		Customer c3 = createCustomer(3);
		
		System.out.println("---------Customer detais-----------");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("Customer 1 HashCode: "+c1.hashCode());
		System.out.println("Customer 2 HashCode: "+c2.hashCode());
		System.out.println("Customer 3 HashCode: "+c3.hashCode());
		
		System.out.println("Is Customer 1 name same as c3: "+c1.equals(c3));
		
		
	}
	
	
}