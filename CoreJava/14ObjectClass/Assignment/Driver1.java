class Product{
	int pId;
	String pName;
	double price;
	Product(int pId,String pName,double price){
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}
	@Override
	public String toString(){
		return super.toString()+"[ {Prouduct Id: " +pId+ "},{Proudct Name: "+pName+"},{Product Price: "+price+"}]";
	}
}
class Driver1{
	public static void main(String args[]){
		Product p1 = new Product(1,"Watch",3000.45);
		Product p2 = new Product(2,"Shoes",4000.35);
		Product p3 = new Product(3,"Laptop",109000.5);
		Product p4 = new Product(4,"Headphone",2900);
		Product p5 = new Product(5,"Shirt",1500.25);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}
}