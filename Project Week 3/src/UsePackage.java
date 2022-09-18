
public class UsePackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create 3 package objects
		Package p1=new Package (6,'A');
		Package p2= new Package (12,'T');
		Package p3= new Package (24,'M');
		
		//invoke method in package objects
		System.out.println("Object 1");
		p1.display();
		
		System.out.println("Object 2");
		p2.display();
		
		System.out.println("Object 3");
		p3.display();

	}

}
