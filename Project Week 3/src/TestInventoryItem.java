import java.util.Scanner;
public class TestInventoryItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare inventory array
		InventoryItem [] inventory;
		Scanner input= new Scanner (System.in);
		
		//assign createInventory method to inventory
		inventory = createInventory (input);
		
		//declare count
		int counthammer=0;
		int countwrench=0;
		int countnails=0;
		
		//calculate sum of each item
		for (int i=0;i<10;i++) {
			if (inventory [i].getDescription().equals("hammer"))
				counthammer += inventory [i].getUnits();
			else if (inventory [i].getDescription().equals("wrench"))
				countwrench += inventory [i].getUnits();
			else if (inventory[i].getDescription().equals("nails"))
				countnails += inventory[i].getUnits();
			else
				System.out.println("Wrong item");
			
		}//end for loop
		
		//print statement
		System.out.println("Total of hammer: "+counthammer);
		System.out.println("Total of wrench: "+countwrench);
		System.out.println("Total of nails: "+countnails);
	}//end main method
	
	//method for array
	public static InventoryItem[] createInventory(Scanner input) {
		// TODO Auto-generated method stub
		InventoryItem [] inventory =new InventoryItem [10];
		
		System.out.println("Enter description and unit: ");
		
		for (int i =0; i<inventory.length;i++) {
			inventory[i]= new InventoryItem (input.next(),input.nextInt());
			
		}
		
		return inventory;
	}//end of array method

}//end of class

