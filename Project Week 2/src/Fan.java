
public class Fan {
	//declare constant variable
	final int SLOW = 1;
	final int MEDIUM=2 ;
	final int FAST=3 ;
	
	//private data field
	private int speed;
	private boolean on;
	private double radius;
	String colour;
	
	Fan (){
		speed=SLOW;
		on=false;
		radius=5;
		colour="blue";
	}
	//Mutator methods//
	//speed mutator//
	public void setSpeed (int speed) {
		this.speed=speed;
	}
	//Turn On mutator
	public void turnOn() {
		on=true;
	}
	//Turn off mutator
	public void turnOff () {
		on=false;
	}
	//radius mutator
	public void setRadius (double radius) {
		this.radius=radius;
	}
	//colour mutator
	public void setColour (String colour) {
		this.colour=colour;
	}
	
	//Accessor methods
	//return speed to String
	public String getSpeed() {
		String s ="";
		switch (speed) {
		case SLOW: s="SLOW";
		break;
		case MEDIUM: s="MEDIUM";
		break;
		case FAST: s="FAST";
		}
		return s;
	}
	// on accessor
	public boolean getOn() {
		return on;
	}
	//radius accessor
	public double getRadius () {
		return radius;
	}
	//colour accessor
	public String getColour () {
		return colour;
	}
	//other method
	public String toString () {
		if (on==true)
			return "Fan speed: "+getSpeed()+"\nColour: "+colour+"\nRadius: "+ radius+"\nThe fan is turn on";
		else
			return "Fan colour: "+colour+"\nRadius: "+radius+"\nThe fan is turn off";
	}
	
	

}
