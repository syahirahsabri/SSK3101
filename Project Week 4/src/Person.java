
public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	
	public Person () {
		this("Unknown","Unknown","Unknown","Unknown");
	}

	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAdress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//toString Method
	public String toString() {
		return "Person name= " + getName() + "\nAddress= " + getAddress() + "\nPhone Number= " + getPhoneNumber() + "\nEmail= " + getEmail();
	}
	
	

}
