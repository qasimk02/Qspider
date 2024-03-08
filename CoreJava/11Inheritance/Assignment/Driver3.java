class HdfcBank
{
	String branch;
	String ifscCode;
	HdfcBank(String branch,String ifscCode){
		this.branch = branch;
		this.ifscCode = ifscCode;
	}
}

class LoanAccount extends HdfcBank
{
	private long accNumber;
	private String accHolderName;
	LoanAccount(String branch,String ifscCode,long accNumber,String accHolderName){
		super(branch,ifscCode);
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
	}
	public long getAccNumber(){
		return accNumber;
	}
	public String getAccHolderName(){
		return accHolderName;
	}
}
class HomeLoanAccount extends LoanAccount
{
	private double loanAmt;
	private double rateOfInterest;
	private double tenure;
	HomeLoanAccount(String branch,String ifscCode,long accNumber,String accHolderName,double loanAmt,double rateOfInterest,double tenure){
		super(branch,ifscCode,accNumber,accHolderName);
		this.loanAmt = loanAmt;
		this.rateOfInterest = rateOfInterest;
		this.tenure = tenure;
	}
	public double getLoanAmt(){
		return loanAmt;
	}
	public double getRateOfInterest(){
		return rateOfInterest;
	}
	public double getTenure(){
		return tenure;
	}
}

class Driver3
{
	public static void main(String args[]){
			HdfcBank bank = new HomeLoanAccount("Andheri Mumbai","MUM2923",1234323432432L,"Qasim Khan",23453.23,3.4,2.2);//upcasting
			System.out.println("Branch: "+bank.branch);
			System.out.println("IFSC Code: "+bank.ifscCode);
			
			LoanAccount loanAcc = (LoanAccount)bank;//downCasting
			System.out.println("Account Number: "+loanAcc.getAccNumber());
			System.out.println("Account Holder Name: "+loanAcc.getAccHolderName());
			
			HomeLoanAccount homeLoanAcc = (HomeLoanAccount)loanAcc;
			System.out.println("Loan Amount: "+homeLoanAcc.getLoanAmt());
			System.out.println("Loan Rate of Interest: "+homeLoanAcc.getRateOfInterest());
			System.out.println("Loan Tenure(in Years): "+homeLoanAcc.getTenure());
	}
}