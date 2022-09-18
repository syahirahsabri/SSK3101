
public class Faculty extends Employee {
	private String officeHours;
	private String rank;
	
	//default constructor
	public Faculty() {
		
	}
	//constuctor with argument
	public Faculty (String name, String address, String phoneNumber, 
			String email, double salary, int office, String officeHours, String rank) {
		super (name, address, phoneNumber, email, salary, office);
		this.officeHours=officeHours;
		this.rank=rank;
	}
	public String getOfficeHours() {
		return officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	//Override toString method from Employee class
	public String toString() {
		return super.toString()+"\nFaculty Office Hours= " + getOfficeHours() + "\nRank= " + getRank();
	}
	

}
