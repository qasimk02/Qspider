class P1{
	//static block gets executed first(even before main method) only once
	//static block gets executed directly in stack it doesn't gets memory or stored
	static{
		int a = 2;//variable need to be intialised
		System.out.println(a);
		System.out.println("Static block gets executed");
	}	
	public static void main(String args[]){
		System.out.println("Main method gets executed");
	}
}
