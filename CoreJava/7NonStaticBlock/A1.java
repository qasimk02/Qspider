class ICICIBankSavingsAcccount{
	
	String accHolderName;
	Long accNumber;
	int accBalance;
	static String BankName = "ICICI";
	
	//SIB
	static{
		System.out.println("Logged in Sccessfully");
	}
	//IIB
	{
		System.out.println("ICICI Bank savings account is ready to use!");
	}
	//non static method
	public void showAccountDetails(){
		System.out.println("Bank Name: "+BankName);
		System.out.println("Account Holder Name: "+this.accHolderName);
		System.out.println("Account Nubmer: "+this.accNumber);
		System.out.println("Account Balance: "+this.accBalance);
	}
	public static void main(String args[]){
		ICICIBankSavingsAcccount acc1 = new ICICIBankSavingsAcccount();
		ICICIBankSavingsAcccount acc2 = new ICICIBankSavingsAcccount();
		ICICIBankSavingsAcccount acc3 = new ICICIBankSavingsAcccount();
		
		//acccount 1
		acc1.accHolderName = "Qasim Khan";
		acc1.accNumber = 9877856777872231;
		acc1.accBalance = 8934342;
		//account 2
		acc1.accHolderName = "Nirah Chalke";
		acc1.accNumber = 8977856778966223;
		acc1.accBalance = 348832;
		//account 3
		acc1.accHolderName = "Sheela";
		acc1.accNumber = 2734855278722312;
		acc1.accBalance = 2332;
		
		acc1.showAccountDetails();
		acc2.showAccountDetails();
		acc13.showAccountDetails();
		
	}

}