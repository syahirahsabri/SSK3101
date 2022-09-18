
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person ("Ali","9 Jalan Abu","01123456789","ali@gmail.com");
		Student student= new Student ("Abu","10/4 Jalan Pangsapuri","0134567891","abu@gmail.com",3);
		Employee employee =new Employee ("Aminah","78 Jalan Permaidani","0123456789","aminah@gmail.com", 6950.20, 100);
		Faculty faculty= new Faculty ("Alia","23 Taman Sutera","0175632146","alia@gmail.com", 5392.10, 3,"8am to 5pm","Doctor");
		Staff staff=new Staff("Faris","19 Taman Universiti","0156321456","faris@gmail.com", 3956.40, 60,"Senior Manager");
		
		//print toString statement
		System.out.println("** PersonClass **"+person.toString()+"\n");
		System.out.println("* Student Class **"+student.toString()+"\n");
		System.out.println("** Employee Class **"+employee.toString()+"\n");
		System.out.println("** Faculty Class **"+faculty.toString()+"\n");
		System.out.println("** Staff Class **"+staff.toString());

	}

}
