import java.util.*;
class Vehicle
{
	int vehicleNumber;
	String vehicleBrand;
	double vehiclePrice;
	
	Vehicle(int vehicleNumber,String vehicleBrand,double vehiclePrice){
		this.vehicleNumber = vehicleNumber;
		this.vehicleBrand = vehicleBrand;
		this.vehiclePrice = vehiclePrice;
	}
	public void vehicleDetails(){
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Vehicle Brand: "+vehicleBrand);
		System.out.println("Vehicle Price: "+vehiclePrice);
	}
}

class Bike extends Vehicle
{
	Bike(int vehicleNumber,String vehicleBrand,double vehiclePrice){
		super(vehicleNumber,vehicleBrand,vehiclePrice);
	}
}

class BikeRider
{
	static Scanner sc;
	private static Bike[] bikes;
	
	public static Bike createBike(int num){
		System.out.print("Enter Bike "+num+" Number: ");
		int bNo = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Bike "+num+" Brand: ");
		String bBrand = sc.nextLine();
		System.out.print("Enter Bike "+num+" Pirce: ");
		double bPrice = sc.nextDouble();
		
		return new Bike(bNo,bBrand,bPrice);
	}
	
	public static void main(String args[]){
		sc = new Scanner(System.in);
		int nOfBikes = sc.nextInt();
		//intializing array to store all the bikes
		bikes = new Bike[nOfBikes];
		
		//creating bikes
		for(int i=0;i<nOfBikes;i++){
			bikes[i] = createBike(i+1);
		}
		
		//printing bike details
		for(int i=0;i<nOfBikes;i++){
			System.out.println("Bike "+(i+1)+" details:");
			bikes[i].vehicleDetails();
			System.out.println("----------------------------------");
		}
		sc.close();
	}
}