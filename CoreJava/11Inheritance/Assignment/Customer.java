import java.util.Scanner;

class ICICIBank
{
	private String branch;
	private int ifscCode;
	
	ICICIBank(String branch,int ifscCode){
		this.branch = branch;
		this.ifscCode = ifscCode;
	}
	
	//getter method to access branch
	public String getBranch(){
		return branch;
	}
	
	//getter method to access ifscCode
	public int getIfscCode(){
		return ifscCode;
	}
}

class LoanAcc extends ICICIBank
{
	private double loanAmt;
	private double tenure;
	
	LoanAcc(String branch,int ifscCode,double loanAmt,double tenure){
		super(branch,ifscCode);
		this.loanAmt = loanAmt;
		this.tenure = tenure;
	}
	
	//method for printing loanAcc details
	public void display(){
		System.out.println("----Loan Account Details----");
		System.out.println("Branch: "+getBranch());
		System.out.println("IFSC Code: "+getIfscCode());
		System.out.println("Loan Amount: "+loanAmt);
		System.out.println("Loan Tenure(in years): "+tenure);
	}
}

class CurrAcc extends ICICIBank
{
	private String accHolderName;
	private long accNumber;
	
	CurrAcc(String branch,int ifscCode,String accHolderName,long accNumber){
		super(branch,ifscCode);
		this.accHolderName = accHolderName;
		this.accNumber = accNumber;
	}
	
	//method for printing CurrAcc details
	public void display(){
		System.out.println("----Current Account Details----");
		System.out.println("Branch: "+getBranch());
		System.out.println("IFSC Code: "+getIfscCode());
		System.out.println("Name: "+accHolderName);
		System.out.println("Account Number: "+accNumber);
	}
}

class Customer
{

	//By declaring Scanner as a global variable, we avoid the need to redeclare it each time 
	//we require it throughout the program.
	static Scanner sc = new Scanner(System.in);
	
	//method to create LoanAcc
	public static LoanAcc createLoanAcc(String branch,int ifscCode){
		System.out.print("Enter Loan Amount: ");
		double loanAmt = sc.nextDouble();
		System.out.print("Enter Loan Tenure(in years): ");
		double tenure = sc.nextDouble();
		return new LoanAcc(branch,ifscCode,loanAmt,tenure);
	}
	
	//method to create CurrAcc
	public static CurrAcc createCurrAcc(String branch,int ifscCode){
		System.out.print("Enter Current Account Holder's Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Enter Current Account Number: ");
		long accNumber = sc.nextLong();
		return new CurrAcc(branch,ifscCode,name,accNumber);
	}
	
	public static void main(String args[]){
		
		System.out.print("Enter number of customer details you wants to enter: ");
		int n = sc.nextInt();
		
		// Creating arrays to store information for n number of customers
        LoanAcc[] loanAccounts = new LoanAcc[n];
        CurrAcc[] currAccounts = new CurrAcc[n];
		
		// Creating n number of customers by entering their details and initializing accounts
		for(int i=0;i<n;i++){
			System.out.println("Enter details for Customer "+(i+1));
			System.out.print("Enter Branch: ");
			sc.nextLine();
			String branch = sc.nextLine();
			System.out.print("Enter IFSC Code: ");
			int ifscCode = sc.nextInt();
			currAccounts[i] = createCurrAcc(branch,ifscCode);
			loanAccounts[i] = createLoanAcc(branch,ifscCode);
			System.out.println("-------------------------------------");
		}
		
		//Printing details of n customers, including both current and loan accounts
		for(int i=0;i<n;i++){
			System.out.println("-------------------------------------");
			System.out.println("Customer "+(i+1)+" Details");
			currAccounts[i].display();
			loanAccounts[i].display();
		}
		
		//closing Scanner
		sc.close();
		
	}
}