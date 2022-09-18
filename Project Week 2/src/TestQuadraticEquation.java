import java.util.Scanner;
public class TestQuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create scanner object
		Scanner input= new Scanner (System.in);
		
		//prompt user to input a,b and c
		System.out.print("Enter a: ");
		double a=input.nextDouble();
		System.out.print("Enter b: ");
		double b= input.nextDouble();
		System.out.print("Enter c: ");
		double c= input.nextDouble();
		
		//create QuadraticEquation object
		QuadraticEquation qe= new QuadraticEquation (a,b,c);
		
		//display discriminant
		System.out.println("The discriminant: "+qe.getDiscriminant());
		
		//compute for the roots if any
		if (qe.getDiscriminant()>0) {
			System.out.println("The equation has two roots");
			System.out.printf("Root 1: %.4f",qe.getRoot1());
			System.out.printf("\nRoot 2: %.4f",qe.getRoot2());
		}
		else if (qe.getDiscriminant()==0) {
			System.out.println("The equation has one root");
			if (qe.getRoot1()>0)
				System.out.printf("Root: %.4f",qe.getRoot1());
			else
				System.out.printf("Root: %.4f",qe.getRoot2());
		}
		else
			System.out.println("The equation has no root");
		

	}

}
