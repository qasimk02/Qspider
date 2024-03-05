//parent class/super class
class DhirubhaiAmbani
{
	static String company = "Reliance Industries";//state
	public void thinkingStyle(){//behaviour
		System.out.println("DhiruBhai Ambani thinking style");
	}
}
//child class/ subclass
class MukeshAmbani extends DhirubhaiAmbani
{
	
}
//Driver class
class India
{
	public static void main(String args[]){
		MukeshAmbani mukku = new MukeshAmbani();
		System.out.println(mukku.company);
		mukku.test();
		mukku.thinkingStyle();
	}
}