
public class InventoryItem {
	private String description;
	private int units;
	
	//create default constructor
	InventoryItem (){
		description ="";
		units= 0;
	}
	//
	InventoryItem (String description){
		this.description=description;
	}
	InventoryItem (int units){
		this.units=units;
	}
	InventoryItem (String description, int units){
		this.description=description;
		this.units=units;
	}
	public String getDescription () {
		return description;
	}
	public int getUnits () {
		return units;
	}
	public void setDescription (String name) {
		this.description=description;
	}
	public void setUnits (int number) {
		this.units=units;
	}

}
