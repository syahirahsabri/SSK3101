
public class TestStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create admin, lecturer and staff object
		Object admin= new Admin("Faris","19 Taman Universiti","0156321456","faris@gmail.com", 3956.40, 60,"Senior Manager","Administration");
		Object lecturer= new Lecturer("Aminah","78 Jalan Permaidani","0123456789","aminah@gmail.com", 6950.20, 100,"Senior Manager",350,"Programming");
		Staff staff= new Staff();
		
		
		System.out.println(" **Admin Class** ");
		staff.PrintDetails(admin);//print toString details in admin class
		System.out.println("\n **Lecturer Class** ");
		staff.PrintDetails(lecturer);//print toString details in lecturer class
		
	
	}
		
	

}
