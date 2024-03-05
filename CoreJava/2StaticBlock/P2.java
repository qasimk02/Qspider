class P2{
	static int a;
	static int b;
	static{
		System.out.println(a);
		System.out.println(b);
		a = 5;
		b = 5;
	}
	static{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String args[]){
		System.out.println(a);
		System.out.println(b);
	}
}
