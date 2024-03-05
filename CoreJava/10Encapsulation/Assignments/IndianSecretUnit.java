import java.util.Scanner;

class RAWAgent
{
	private int rawAgentId;
	private String rawAgentCodeName;
	private String rawAgentMissionName;
	
	//3-FA constructor(All 3 details are mandatory while creating a raw agent)
	RAWAgent(int rawAgentId,String rawAgentCodeName,String rawAgentMissionName){
		this.rawAgentId = rawAgentId;
		this.rawAgentCodeName = rawAgentCodeName;
		this.rawAgentMissionName = rawAgentMissionName;
	}
	
	//getter method for rawAgentId
	public int getRawAgentId(){
		return rawAgentId;
	}
	
	//getter method for rawAgentCodeName
	public String getRawAgentCodeName(){
		return rawAgentCodeName;
	}
	
	//getter and method setter for rawAgentMissionName
	public String getRawAgentMissionName(){
		return rawAgentMissionName;
	}
	public void setRawAgentMissionName(String rawAgentMissionName){
		this.rawAgentMissionName = rawAgentMissionName;
	}
	
}

class IndianSecretUnit
{
	//no one other than indian secret unit can access this list
	private RAWAgent[] rawAgentsList;
	static Scanner sc;
	private RAWAgent createRawAgent(int num){
		System.out.print("Enter Raw Agent "+num+" Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Raw Agent "+num+" Code Name: ");
		String codeName = sc.nextLine();
		System.out.print("Enter Raw Agent "+num+" Mission Name: ");
		String missionName = sc.nextLine();
		System.out.println("----------------------------------------");
		RAWAgent newlyCreateRAWAgent = new RAWAgent(id,codeName,missionName);
		return newlyCreateRAWAgent;
	}
	private void displayRawAgentDetails(RAWAgent obj,int num){
		System.out.println("RAW Agent "+num+" Id: "+obj.getRawAgentId());
		System.out.println("RAW Agent "+num+" Code Name: "+obj.getRawAgentCodeName());
		System.out.println("RAW Agent "+num+" Mission Name: "+obj.getRawAgentMissionName());
		System.out.println("----------------------------------------");
	}
	public static void main(String args[]){
		//central body who has all the authority
		IndianSecretUnit indianSecretUnit = new IndianSecretUnit();
		
		sc = new Scanner(System.in);
		System.out.print("How many raw agent you wants to create: ");
		int n = sc.nextInt();
		
		//array to store all the raw agents
		indianSecretUnit.rawAgentsList = new RAWAgent[n];
		
		//creating raw agents
		for(int i=0;i<n;i++){
			indianSecretUnit.rawAgentsList[i] = indianSecretUnit.createRawAgent(i+1);
		}
		
		//printing all the details of raw agents
		System.out.println("=========================================");
		for(int i=0;i<n;i++){
			indianSecretUnit.displayRawAgentDetails(indianSecretUnit.rawAgentsList[i],i+1);
		}
		System.out.println("=========================================");
		
		//modifying Raw Agent mission
		System.out.print("Which agent mission you wants to update Enter 1 to "+n+": ");
		int agentToUpdateIndex = sc.nextInt();
		sc.nextLine();
		if(agentToUpdateIndex>0 && agentToUpdateIndex<=n){
			System.out.print("Which Mission you wants to assign: ");
			RAWAgent rawAgentToBeUpdated = indianSecretUnit.rawAgentsList[agentToUpdateIndex-1];
			rawAgentToBeUpdated.setRawAgentMissionName(sc.nextLine());
		}else{
			System.out.println("INVALID AGENT! PLEASE ENTER VALID NUMBER BETWEEN 1 TO "+n);
		}
		
		//printing modified details
		System.out.println("Updated Details");
		for(int i=0;i<n;i++){
			indianSecretUnit.displayRawAgentDetails(indianSecretUnit.rawAgentsList[i],i+1);
		}
		
		sc.close();
	}
}