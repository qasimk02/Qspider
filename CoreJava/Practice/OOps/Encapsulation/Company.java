import java.util.*;
class Employee
{
	private int eId;
	String eName;
	private double eSalary;
	int eYrsExp;
	
	Employee(int eId,String eName,double eSalary,int eYrsExp){
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eYrsExp = eYrsExp;
	}
	
	//getter methods
	public int getEId(){
		return eId;
	}
	public double getESalary(){
		return eSalary;
	}
	
	//setter methods
	public void setEId(int eId){
		this.eId = eId;
	}
	public void setESalary(double eSalary){
		this.eSalary = eSalary;
	}
}

class Company{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of employee details you want to enter: ");
		int n = sc.nextInt();
		Employee emps[] = new Employee[n];
		for(int i=0;i<n;i++){
			//input
			System.out.println("Enter Employee "+(i+1)+" Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee "+(i+1)+" Name: ");
			String name = sc.nextLine();
			System.out.println("Enter Employee "+(i+1)+" Salary: ");
			double salary = sc.nextDouble();
			System.out.println("Enter Employee "+(i+1)+" Number of Years of Experience: ");
			int nYrsExp = sc.nextInt();
			
			//creating employees
			Employee emp = new Employee(id,name,salary,nYrsExp);
			emps[i] = emp;
		}
		System.out.println("==================================================");
		for(int i=0;i<n;i++){
			System.out.println("Employee "+(i+1)+" Details");
			System.out.println("Employee Id: "+emps[i].getEId());
			System.out.println("Employee Name: "+emps[i].eName);
			System.out.println("Employee Salary: "+emps[i].getESalary());
			System.out.println("Employee Years of Experience: "+emps[i].eYrsExp);
			System.out.println("---------------------------------------------");
		}
		System.out.println("==================================================");
		//updating second employee salary
		double sndESalary = emps[1].getESalary();
		emps[1].setESalary(sndESalary + sndESalary*0.3);
		
		//updating last employee salary
		double lastESalary = emps[n-1].getESalary();
		emps[n-1].setESalary(lastESalary - lastESalary*0.05);
		
		System.out.println("Second Employee updated salary: "+emps[1].getESalary());
		System.out.println("Last Employee updated salary: "+emps[n-1].getESalary());
		
	}
}