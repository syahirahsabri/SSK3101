

public class TestFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create fan 1 object
		Fan fan1=new Fan ();
		
		//assign speed 3, radius 10, colour yellow and turn it on the fan
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColour("yellow");
		fan1.turnOn();
		
		//create fan 2 object
		Fan fan2=new Fan();
		
		//assign 2 speed, radius 5, colour blue and turn it off 
		fan2.turnOff();
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColour("blue");
		
		//Display the property of fan
		System.out.println(fan1.toString());
		System.out.println();
		System.out.println(fan2.toString());

	}

}
