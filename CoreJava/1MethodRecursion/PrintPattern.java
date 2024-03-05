class PrintPattern
{
	public static void printNumbers(int num){
		if(num==20423){
			return;
		}
		printNumbers(num+1);
		System.out.println(num+" ");
	}
	public static void main(String args[]){
		printNumbers(52);
	}
}