//Doubt 
//what happens when we create paramatrised constructor in super class
//and call the default constructor/paramatrised constructor of subclass without calling any super class
//constructor

class P1
{
	int i;
	int j;
	
	//if we create paramatrised constructor in super class remember that
	//whenever default constructor,paramatrised constructor is been called
	//in subclass without explicitly calling any constructor of super class with
	//the help of super calling statement then the compiler will call the 
	//super()/no arg constructor of super class implicitly
	//and as we created paramatrised constructor in super class there is no
	//default constructor then it will threw an error
	
	
	P1(int i,int j){
		this.i = i;
		this.j = j;
	}
}

class P2 extends P1
{
	
	P2(int i,int j){
		//by default super() will be called implicitly by compiler and will threw error 
		//cuz we've not defined default constructor instead there is paramatrised constructor
		
		//soln
		//1) we should create default constructor
		//2) super(i,j);
	}
}

class Test
{
	public static void main(String args[]){
		P2 ref = new P2(10,20);
	}
}