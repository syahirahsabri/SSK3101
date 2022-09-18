
public class Employee extends Person {
	private int office;
	private double salary;
	private MyDate dateHired;
	
	//default constructor
	public Employee() {
		
	}
	//constructor with arg from Person class
	public Employee (String name, String address, String phoneNumber, String email, double salary, int office) {
		super(name, address, phoneNumber, email);
		this.salary= salary;
		this.office= office;
		this.dateHired= new MyDate();

	}
	//return office number
	public int getOffice() {
		return office;
	}
	//return salary
	public double getSalary() {
		return salary;
	}
	//return date
	public String getDateHired() {
		return dateHired.getDay()+"/"+dateHired.getMonth()+"/"+dateHired.getYear();
	}
	//set new office number
	public void setOffice(int office) {
		this.office = office;
	}
	//set new salary 
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//set new date
	public void setDateHired() {
		dateHired=new MyDate();
	}
	
	//Override toString method from Person class
	public String toString() {
		return super.toString()+"\nEmployee office= " + getOffice() + "\nSalary= RM" + getSalary();
	}
	

}
