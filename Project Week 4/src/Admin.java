
public class Admin extends Staff{
	private String className;//declare private class name
	
	public Admin() {//default constructor
		
	}
	//constructor with arg
	public Admin(String name, String address, String phoneNumber, String email, double salary, int office, String title,String className) {
		super(name, address, phoneNumber,email,salary,office,title);
		this.className=className;
	}
	//return class name
	public String getClassName() {
		return className;
	}
	//Override toString method
	public String toString() {
		return super.toString()+"\nClass Name: "+getClassName();
	}

}
