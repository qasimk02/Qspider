interface Amazon
{
	abstract public void login();
	abstract public void register();
	abstract public void purchase();
	abstract public void logout();
}


class AmazonImpl implements Amazon
{
	public void login(){
		System.out.println("Logged in successfully....");
	}
	public void register(){
		System.out.println("Registered successfully...");
	}
	public void purchase(){
		System.out.println("You've purchased T-Shirt");
	}
	public void logout(){
		System.out.println("Logout successfully...");
	}
}

//abstraction using interface(100%)
class Driver2
{
	public static void main(String args[]){
		Amazon ref = new AmazonImpl();
		ref.login();
		ref.register();
		ref.purchase();
		ref.logout();
	}
}	