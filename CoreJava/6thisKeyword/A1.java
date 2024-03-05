class A1{

	static String state = "Maharashtra";
	static int budget = 2943;
	char ch = 'g';
	boolean isDeclared = false;
	
	public void sheela(){
		char ch = 'o';
		boolean isDeclared = true;
		System.out.println("Hi baby");
		System.out.println("global static state: "+state);
		System.out.println("global static budget: "+budget);
		System.out.println("local character: "+ch);
		System.out.println("local is decalred: "+isDeclared);
		System.out.println("global non static character: "+this.ch);
		System.out.println("global non static is decalred: "+this.isDeclared);
		System.out.println("Bye baby");
	}
	
	static{
		String state="UP";
		int budget = 3453;
		System.out.println("static block begins");
		System.out.println("local state: "+state);
		System.out.println("local budget: "+budget);
		System.out.println("global static state: "+A1.state);
		System.out.println("global static budget: "+A1.budget);
		A1 ref = new A1();//non static var can be accesssed from static context in only one way
		System.out.println("global non static character: "+ref.ch);
		System.out.println("global non static is decalred: "+ref.isDeclared);
		System.out.println("static block ends");
	}
	
	public static void main(String args[]){
	
		
	    int budget = 3453;
		boolean isDeclared = true;
		System.out.println("MB");
		System.out.println("global static state: "+state);
		System.out.println("local budget: "+budget);
		System.out.println("global static budget: "+A1.budget);//static var can be called in three ways
		//non static called from static context will have only one method by ref
		A1 ref = new A1();
		System.out.println("global non satatic character: "+ref.ch);
		System.out.println("local is decalred: "+isDeclared);
		System.out.println("global non static is decalred: "+ref.isDeclared);
		ref.sheela();
		System.out.println("ME");
	
	}
	

}