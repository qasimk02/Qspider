class Customer{
	int cId;
	String cName;
	Customer(){
	}
	Customer(int cId,String cName){
		this.cId = cId;
		this.cName = cName;
	}
	public void printCustomerDetails(){
		System.out.println("---------------------Customer Details-------------------");
		System.out.println("Customer Id: "+cId);
		System.out.println("Customer Name: "+cName);
		System.out.println("--------------------------------------------------------");
	}
	public static void main(String args[]){
		Customer c1 = new Customer(1,"Qasim Khan");
		Customer c2 = new Customer(2,"Niraj Chalke");
		Customer c3 = new Customer(3,"Tejas Rabad");
		c1.printCustomerDetails();
		c2.printCustomerDetails();
		c3.printCustomerDetails();
	}

}