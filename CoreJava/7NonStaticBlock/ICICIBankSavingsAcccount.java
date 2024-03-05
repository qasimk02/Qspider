class ICICIBankSavingsAcccount{
	
	String accHolderName;
	long accNumber;
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
		System.out.println("----------------------------------------");
		System.out.println("Bank Name: "+BankName);
		System.out.println("Account Holder Name: "+this.accHolderName);
		System.out.println("Account Nubmer: "+this.accNumber);
		System.out.println("Account Balance: "+this.accBalance);
		System.out.println("----------------------------------------");
	}
	public static void main(String args[]){
		//acccount 1
		ICICIBankSavingsAcccount acc1 = new ICICIBankSavingsAcccount();
		acc1.accHolderName = "Qasim Khan";
		acc1.accNumber = 9877856777872231L;
		acc1.accBalance = 8934342;
		acc1.showAccountDetails();
		
		//acccount 2
		ICICIBankSavingsAcccount acc2 = new ICICIBankSavingsAcccount();
		acc2.accHolderName = "Niraj Chalke";
		acc2.accNumber = 8977856778966223L;
		acc2.accBalance = 348832;
		acc2.showAccountDetails();
		
		//acccount 3
		ICICIBankSavingsAcccount acc3 = new ICICIBankSavingsAcccount();
		acc3.accHolderName = "Sheela";
		acc3.accNumber = 2734855278722312L;
		acc3.accBalance = 2332;
		acc3.showAccountDetails();
		
	}

}