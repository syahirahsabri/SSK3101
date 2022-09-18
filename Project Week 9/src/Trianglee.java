
public class Trianglee extends GeometricFigure implements SidedObject, ObjectType {
	 private double height;
	 private double width;

		Trianglee(double height, double width) {
			this.height=height;
			this.width=width;
		}
	
		public double getHeight() {
			return height;
		}

		public double getWidth() {
			return width;
		}

		public double findArea() {
			// TODO Auto-generated method stub
			return height*width*0.5;
		}
		
		@Override
		public String printSides() {
			// TODO Auto-generated method stub
			return "\nNumber of sides: 3";
		}

		@Override
		public String printObjectType() {
			// TODO Auto-generated method stub
			return "\nType of Object: Triangle";
		}
		@Override
		public String toString() {
			return "\nObject Name: Triangle"
					+"\nArea of object: "+findArea()+printSides()+printObjectType();
		}
		
	}

