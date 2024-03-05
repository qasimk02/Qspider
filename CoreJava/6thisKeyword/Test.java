class Test{
	
	//non static method
	public void sheela(){
		System.out.println("Hi Baby.");
		//the object which call this method(sheela) will have 
		//address stored inside this(non static variable) known as
		//this reference variable
		System.out.println("this ref var in sheela: "+this);
		System.out.println("Bye Baby.");
	}
	public static void bro(){
		System.out.println("Hi bro.");
		//as this is a non-static variable it can't be referred
		//from static context although this mehtod is called by object
		//reference
		//System.out.println("this ref var in bro: "+this);
		System.out.println("Bye bro.");
	}
	public static void main(String args[]){
		System.out.println("MB");
		
		Test ref = new Test();
		System.out.println("ref var in main: "+ref);
		ref.sheela();
		ref.bro();
		
		System.out.println("ME");
	
	}

}