class Order{
	String dish = "Pizza";
	{
		System.out.println("Order has been placed successfully");
		System.out.println("Dish: "+dish);
	}
	
	public static void main(String args[]){
	
		Order order1 = new Order();
		order1.dish = "Biryani";
	}
}