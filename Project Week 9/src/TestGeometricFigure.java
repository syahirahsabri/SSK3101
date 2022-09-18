/**NAME: NOOR SYAHIRAH BINTI MOHD SABRI
 * MATRIC NO: 207542
 * LAB WEEK: 9
 * QUESTION: 1 
 */

import java.util.*;
public class TestGeometricFigure {
	public static void main (String [] args) { 
	Scanner input= new Scanner (System.in);
	double h,w;
	double ht, wt;
	
	//prompt user to input square height and width
	System.out.print("Enter square height: ");
	h=input.nextDouble();
	System.out.print("Enter square width: ");
	w=input.nextDouble();
	
	//prompt user to input triangle height and width
	System.out.print("Enter triangle height: ");
	ht=input.nextDouble();
	System.out.print("Enter triangle width: ");
	wt=input.nextDouble();
	
	//create square and triangle object
	GeometricFigure square=new Square(h,w);
	GeometricFigure triangle= new Trianglee (ht,wt);
	
	printDetails(square,triangle);//print details method
	
	}

	private static void printDetails(GeometricFigure square, GeometricFigure triangle) {
		System.out.println(square.toString());
		System.out.println(triangle.toString());
		System.out.println("\nIs the area same?"+square.equalArea(triangle));
		
	}
}






