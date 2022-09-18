
public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	//Construct default constructor for Triangle object
	public Triangle () {
		this(1.0,1.0,1.0);
	}
	
	//Construct constructor with specified side1, side2 and side3
	public Triangle (double side1, double side2, double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	//Get Side1
	public double getSide1() {
		return side1;
	}
	//Get Side2
	public double getSide2() {
		return side2;
	}
	//Get Side3
	public double getSide3() {
		return side3;
	}
	//Get Area
	public double getArea() {
		double s= (side1+side2+side3)/2;
		return Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
	}
	//Get Perimeter
	public double getPerimeter() {
		return side1+side2+side3;
	}

	//Override toString method in parent class
	public String toString() {
		return super.toString()+"\nTriangle: side1=" + side1 + "\n\t  side2=" + side2 + "\n\t  side3=" + side3;
	}
	

}
