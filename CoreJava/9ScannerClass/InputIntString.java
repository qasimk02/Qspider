import java.util.Scanner;

class InputIntString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();
		//que--> why an extra sc.nextLine is needed 
		//ans--> When we give int input and enter so enter is itself a character "/n"
		//       so sc.nextLine will consider it as input and skip the input for str
		//       so we need to use one extra sc.nextLine() such that it consider enter("/n") 
		// 		 as input and consider next one as the string input
		String str = sc.nextLine();
		System.out.println("x: "+x);
		System.out.println("str: "+str);
	
	}
}