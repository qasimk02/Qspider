class A1{
	String name;
	A1(){
		System.out.println("Default Constructor");
	}
	
	A1(String name){
		this.name = name;
		System.out.println("Parametrised Constructor with parameter: "+this.name);
	}
	
	public static void main(String args[]){
		A1 ref1 = new A1();
		A1 ref2 = new A1("Qasim Khan");
	}

}