
public class Square extends GeometricFigure implements SidedObject, ObjectType{
	private double height;
	private double width;
	
	Square(double height, double width) {
		this.height=height;
		this.width=width;
	}

	public double findArea() {
		// TODO Auto-generated method stub
		return height*width;
	}
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public String printSides() {
		return "\nNumber of sides: 4";
			
	}

	@Override
	public String printObjectType() {
		// TODO Auto-generated method stub
		return "\nType of object: Square";
	}
	@Override
	public String toString() {
		return  "\nObject Name: Square"
				+ "\nArea of object: "+findArea()+printSides()+printObjectType();
	}


	
	
}
