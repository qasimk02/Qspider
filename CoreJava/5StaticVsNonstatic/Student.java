class Student{
	static String collegeName="XIE";
	String studentName;
	static{
		System.out.println("Static Block Begins");
		long collegeCode = 765;
		
		//creating object
		Student st1 = new Student();
		st1.studentName = "Qasim Khan";
		
		
		Student st2 = new Student();
		st2.studentName = "Niraj Chalke";
		
		System.out.println("Student 1 Details :");
		System.out.println("College Name: "+collegeName);
		System.out.println("College Code: "+collegeCode);
		System.out.println("Student Name: "+st1.studentName);
		
		
		System.out.println("Student 2 Details :");
		System.out.println("College Name: "+collegeName);
		System.out.println("College Code: "+collegeCode);
		System.out.println("Student Name: "+st2.studentName);
		System.out.println("Static Block Ends");
		
	}
	public static void main(String args[]){
		System.out.println("MB");
		System.out.println("ME");
	}
}