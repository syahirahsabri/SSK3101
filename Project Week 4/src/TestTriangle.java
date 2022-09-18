import java.util.Scanner;
public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		
		System.out.println("Enter 3 sides of triangle: ");
		//triangle object is created
		Triangle triangle=new Triangle (input.nextDouble(),input.nextDouble(),input.nextDouble());
		
		System.out.print("Enter triangle colour: ");
		//invoke setColour method from GeometricObject Class
		triangle.setColour(input.next());
		
		System.out.print("Is the triangle is filled (true or false): ");
		//invoke setFilled method from GeometricObject Class
		triangle.setFilled(input.nextBoolean());
		
		//print statement
		System.out.println("\n*Properties of triangle*");
		System.out.println(triangle.toString());
		System.out.printf("Area: %.2f",triangle.getArea());
		System.out.println("\nPerimeter: "+triangle.getPerimeter());
		

	}

}
