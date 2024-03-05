class Product{
	int pId;
	String pName;
	String pBrand;
	double pPrice;
	
	Product(int pId,String pName,String pBrand,double pPrice){
		this.pId = pId;
		this.pName = pName;
		this.pBrand = pBrand;
		this.pPrice = pPrice;
	}
	
	public void printProductDetails(){
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Product Id: "+pId);
		System.out.println("Product Name: "+pName);
		System.out.println("Product Brand: "+pBrand);
		System.out.println("Product Price: "+pPrice);
		System.out.println("------------------------------------------------------------------------");
	}
	public static void main(String args[]){
		Product p1 = new Product(1,"Shoes","Nike",2979.2);
		Product p2 = new Product(2,"Shirts","Zara",5979.37);
		Product p3 = new Product(3,"Laptop","Apple",100079.78);
		Product p4 = new Product(4,"Watch","Rolex",28666.2);
		Product p5 = new Product(5,"Jeans","H&M",5779.2);
		
		p1.printProductDetails();
		p2.printProductDetails();
		p3.printProductDetails();
		p4.printProductDetails();
		p5.printProductDetails();
	}
}