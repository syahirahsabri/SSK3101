
public class Student extends Person {
	private int status;
	private final int FRESHMAN= 1;
	private final int SOPHOMORE= 2;
	private final int JUNIOR= 3;
	private final int SENIOR=4;
	
	//default constructor
	public Student () {
		
	}
	//constructor with arg from superclass
	public Student (String name, String address, String phoneNumber, String email,int status) {
		super(name, address, phoneNumber, email);
		this.status=status;
	}
	//return status
	public String getStatus() {
		switch (status) {
		case 1: return "Freshman";
		case 2: return "Sophomore";
		case 3: return "Junior";
		case 4: return "Senior";
		default: return "Unknown";
		}
	}
	
	//Override toString method from Person class
	public String toString() {
		return super.toString()+"\nStudent status= " + getStatus();
	}
	

}
