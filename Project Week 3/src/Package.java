import java.util.Scanner;
public class Package {
	//declare data field
	private int weight;
	private double shipping_cost;
	char shipping_method;
	double insurance_cost;
	//default constructor
	Package (){
		
	}
	//constructor with arg
	Package (int weight,char shipping_method){
		this.weight=weight;
		this.shipping_method=shipping_method;
		shipping_cost= calculateCost ();
		insurance_cost= insuredCost ();
	}
	//method for insurance cost
	public double insuredCost() {
		// TODO Auto-generated method stub
		double insurance;
		if (shipping_cost>= 0 && shipping_cost <=1.00)
			insurance= 2.45;
		else if (shipping_cost>= 1.01 && shipping_cost <=3.00)
			insurance=3.95;
		else
			insurance= 5.55;
		return insurance;
	}//end insurance cost method
	//method to calculate cost
	public double calculateCost() {
		// TODO Auto-generated method stub
		double cost=0;
		if (shipping_method== 'A') {
			if (weight>=1 && weight<=8)
				cost = 2.00;
			else if (weight >= 9 && weight <= 16)
				cost= 4.50;
			else
				cost=4.50;
		}
		else if (shipping_method =='T') {
			if (weight>=1 && weight<=8)
				cost = 1.50;
			else if (weight >= 9 && weight <= 16)
				cost= 2.35;
			else
				cost=3.25;
		}
		else if (shipping_method=='M') {
			if (weight>=1 && weight<=8)
				cost = 0.50;
			else if (weight >= 9 && weight <= 16)
				cost= 1.50;
			else
				cost=2.15;
		}
			
		return cost;
	}//end calculate cost method
	//display statement method
	public void display () {
			System.out.println("Weight of the object (in ounces): "+weight+"oz.");
			System.out.println("Shipping method: "+shipping_method);
			System.out.println("Shipping insurance: RM"+insurance_cost);
			System.out.printf("Total of shipping cost: RM%.2f",(shipping_cost+insurance_cost));
			System.out.println("\n");
			
	}//end display method
	
	

}
