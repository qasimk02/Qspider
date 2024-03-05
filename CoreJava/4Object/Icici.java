class Icici{
	int accountNo;
	String name;
	double amount;
	public static void main(String args[]){
		Icici myPersonalAccount = new Icici();
		myPersonalAccount.accountNo=1293434;
		myPersonalAccount.name="Qasim Khan";
		myPersonalAccount.amount=28383.22;
		
		Icici myProfessionalAccount = new Icici();
		myProfessionalAccount.accountNo=1234894;
		myProfessionalAccount.name="Mohammad Qasim";
		myProfessionalAccount.amount=283838223.343;
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("My Personal Account Info \n"+"Account Number: "+myPersonalAccount.accountNo+" | Name: "+myPersonalAccount.name+" | Amount: "+
myPersonalAccount.amount);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("My Professional Account Info \n"+"Account Number: "+myProfessionalAccount.accountNo+" | Name: "+myProfessionalAccount.name+" | Amount: "+
myProfessionalAccount.amount);
		
	}
}