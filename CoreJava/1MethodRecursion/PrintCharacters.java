class PrintCharacters
{
	public static void printCharacters(char ch){
		if(ch > 'z'){
			return;
		}
		System.out.print(ch +" ");
		ch++;
		printCharacters(ch);
	}
	public static void main(String args[]){
		printCharacters('a');
	}
}