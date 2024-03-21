abstract class Amazon
{
	abstract public void login();
	abstract public void register();
	abstract public void purchase();
	public void logout(){
		System.out.println("Logout successfully...");
	}
}


class AmazonImpl extends Amazon
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
}

//abstraction using abstract class(Not 100%) cuz in abstract class there could be concrete method as well 
class Driver1
{
	public static void main(String args[]){
		Amazon ref = new AmazonImpl();
		ref.login();
		ref.register();
		ref.purchase();
		ref.logout();
	}
}