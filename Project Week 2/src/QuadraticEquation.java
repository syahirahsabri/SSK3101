
public class QuadraticEquation {
	//private data field to represent the coefficient
	private double a;
	private double b;
	private double c;
	
	//create constructor with arguments
	QuadraticEquation (double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	//Accessor method
	//return a
	public double getA() {
		return a;
	}
	//return b
	public double getB() {
		return b;
	}
	//return c
	public double getC() {
		return c;
	}
	//return calculation of discriminant
	public double getDiscriminant () {
		return b*b-(4*a*c);
	}
	//return root 1
	public double getRoot1() {
		if (getDiscriminant()>=0)
			return ((-b)+Math.sqrt(b*b-(4*a*c)))/2*a;
		else
			return 0;
	}
	//return root 2
	public double getRoot2() {
		if (getDiscriminant()>=0)
			return ((-b)-Math.sqrt(b*b-(4*a*c)))/2*a;
		else
			return 0;
		
	}

}
