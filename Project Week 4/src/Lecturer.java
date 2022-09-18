
public class Lecturer extends Staff {
	//declare private data fields
	private int room_no;
	private String subject;
	
	public Lecturer() {//default constructor
		
	}
	//constructor with arg
	public Lecturer (String name, String address, String phoneNumber, String email, double salary, int office, String title,int room_no, String subject) {
		super(name, address, phoneNumber,email,salary,office,title);
		this.room_no=room_no;
		this.subject=subject;
	}
	//return room number
	public int getRoom_no() {
		return room_no;
	}
	//return subject
	public String getSubject() {
		return subject;
	}
	//Override toString method
	public String toString() {
		return super.toString()+"\nRoom Number: "+getRoom_no()+"\nSubject: "+getSubject();
	}

}
