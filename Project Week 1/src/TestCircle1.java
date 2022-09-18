
public class TestCircle1 {
	
		public static void main(String[] args) {
		
		double localVar=0;
		
		Circle1 myCircle = new Circle1(5.00);
		
		System.out.println("The area of the circle of radius "+myCircle.radius + " is " +myCircle.getArea());
		
		Circle1 yourCircle = new Circle1();
		
		System.out.println("The default value for radius is " +yourCircle.radius);
		
		System.out.println("Default value for local variable is " +localVar);
		
		// yourCircle.radius =
		
		//System.out.println(“The area of the circle of radius “ +yourCircle.radius + “ is “ +yourCircle.getArea());
		
		
}
}
