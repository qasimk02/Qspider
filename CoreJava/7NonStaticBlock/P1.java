class P1{
	static int a = 4;
	int b = 5;
	
	{
		int a = 7;
		int b = 8;
		System.out.println("IIB begins");
		System.out.println("local var a: "+a);
		System.out.println("global static var a: "+P1.a);
		System.out.println("local var b: "+b);
		System.out.println("global non-static var b: "+this.b);
		System.out.println("IIB ends");
	}
	static{
		int a = 3;
		int b = 9;
		System.out.println("SIB begins");
		System.out.println("local var a: "+a);
		System.out.println("global static var a: "+P1.a);
		P1 ref = new P1();
		System.out.println("local var b: "+b);
		System.out.println("global non-static var b: "+ref.b);
		System.out.println("SIB ends");
	}
	
	public static void main(String args[]){
		System.out.println("MB");
		System.out.println("ME");
	}
	
	

}