
public class Staff extends Employee {
	private String title;//declare private title
	
	//default constructor
	public Staff() {
		
	}
	//constructor with arg 
	public Staff(String name, String address, String phoneNumber, String email, double salary, int office, String title) {
		super(name, address, phoneNumber,email,salary,office);
		this.title=title;
		
	}
	//return title
	public String getTitle() {
		return title;
	}
	//assign new title
	public void setTitle(String title) {
		this.title = title;
	}
	//print details method with arg og Object o
	public void PrintDetails (Object o) {
		if (o instanceof Admin)
			System.out.println(((Admin)o).toString());
		if (o instanceof Lecturer)
			System.out.println(((Lecturer)o).toString());
	}

	//Override toString method in Employee class
	public String toString() {
		return super.toString()+"\nStaff title: " + getTitle();
	}
	

}
