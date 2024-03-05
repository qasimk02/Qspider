class Employee{
	int eId;
	String eName;
	double eSalary;

	//1
	Employee(){
	}
	//2
	Employee(int eId){
		this.eId = eId;
	}
	//3
	Employee(int eId,String eName){
		this(eId);
		this.eName = eName;
	}
	//4
	Employee(int eId,String eName,double eSalary){
		this(eId,eName);
		this.eSalary = eSalary;
	}
	
	public void printEmployeeDetails(){
		System.out.println("Emp Id:"+eId);
		System.out.println("Emp Name:"+eName);
		System.out.println("Emp Salary:"+eSalary);
		System.out.println("------------------------------------------------------------------------");
	}
	
	public static void main(String args[]){
		Employee e1 = new Employee();
		Employee e2 = new Employee(10);
		Employee e3 = new Employee(20,"Sheela");
		Employee e4 = new Employee(30,"Shakila",29999.9);
		
		System.out.println("===========================================================================");
		e1.printEmployeeDetails();
		e2.printEmployeeDetails();
		e3.printEmployeeDetails();
		e4.printEmployeeDetails();
		
	
	}
}