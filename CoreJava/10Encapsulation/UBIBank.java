class ATM
{
	private double money = 100000;//state --> its private means no one can access other than this class
//Permission -- getter method -- to get/access private data
	public double getMoney(){
		return money;
	}
//Permission -- setter method -- to set/modify private data
	public void setMoney(double money){
		this.money = money;
	}
	
	public void withdraw()//behaviour
	{
		System.out.println("Macha you can withdraw the cash");
	}
}

class UBIBank
{
	public static void main(String args[]){
		ATM atm = new ATM();
		//--> not accessible as its private
		//System.out.println("Total amount present in ATM: "+atm.money);
		//atm.money = 130000;
		
		//--> but we can access by using getter and setter method
		atm.setMoney(130000);
		System.out.println("Total amount present in ATM: "+atm.getMoney());
		atm.withdraw();
	}
}