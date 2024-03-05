class Human{
	private float strength;
	Human(float strength){
		this.strength = strength;
	}
	public void run(){
		if(strength<2){
			System.out.println("Sorry you can't run you don't have strength to run");
		}else{
			System.out.println("Running with strength level of: "+strength);
		}
	}

}
//Driver class
class P2{
	public static void main(String args[]){
		Human h1 = new Human(1.2f);
		Human h2 = new Human(3.2f);
		h1.run();
		h2.run();
	}
}