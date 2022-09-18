//NAME: NOOR SYAHIRAH BINTI MOHD SABRI
//MATRIC: 207542
//ASSIGNMENT: LAB WEEK 1
public class Rectangle {
	double width=1.0;
	double height=1.0;
	
	//constuctor default value
	Rectangle(){	
	}
	
	//constructor with argument
	Rectangle(double newWidth, double newHeight){
		width=newWidth;
		height= newHeight;
	}
	//calculate area
	double getArea() {
		return width*height;
	}
	//calculate perimeter
	double getPerimeter() {
		return width+width+height+height;
	}

}
