//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//MATRIC: 207542
//ASSIGNMENT: LAB WEEK 1
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create rectangle 1 object
		Rectangle r1= new Rectangle(4,40);
		System.out.printf("Rectangle 1:\nWidth= %.2f\nHeight= %.2f\nArea= %.2f\nPerimeter= %.2f"
				,r1.width,r1.height,r1.getArea(),r1.getPerimeter());
		
		//create rectangle 2 object
		Rectangle r2= new Rectangle(3.5,35.9);
		System.out.println();
		System.out.printf("\nRectangle 2:\nWidth= %.2f\nHeight= %.2f\nArea= %.2f\nPerimeter= %.2f"
				,r2.width,r2.height,r2.getArea(),r2.getPerimeter());
	}

}
