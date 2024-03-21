class SeniorSofwareEngineer 
{
	String name ;
	int deptno ;
	String designation ;
	
	public SeniorSofwareEngineer(String name, int deptno,String designation) {
		this.deptno=deptno;
		this.designation=designation;
		this.name=name;
	}

	public void workingStyle(){
		System.out.println("Seniors are working on their skills");
	}
}
class JuniorSoftwareEngineer extends SeniorSofwareEngineer
{
	public JuniorSoftwareEngineer(String name, int deptno, String designation) {
		super(name, deptno, designation);
	}
	//overriden method
	public void workingStyle(){
		System.out.println("Junier working on their skills");
	}
	public void details()
	{
		System.out.println("Name is : "+name);
		System.out.println("Deptno is : "+deptno);
		System.out.println("Designation is : "+designation);	
		super.workingStyle();
	}
}
public class Company
{
	public static void main(String[] args) 
	{
		SeniorSofwareEngineer ref = new JuniorSoftwareEngineer("Raj",30, "Mumbai"); //Upcasting
		ref.workingStyle(); // call method of junier software engineer
		JuniorSoftwareEngineer ref1 = (JuniorSoftwareEngineer)ref; //Downcasting
		ref1.details();
	}
}


//Output
//Junior working on their skills
//Name is : Raj
//Deptno is : 30
//Designation is : Mumbai
//Senior working on their skills