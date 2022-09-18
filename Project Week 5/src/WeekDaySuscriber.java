
public class WeekDaySuscriber extends NewspaperSubscriber {
	
	//constructor with arg service type and address
	public WeekDaySuscriber (String serviceType,String address) {
		super(serviceType, address);
		
	}
	//return 3.50 as subscription rate in weekday subscriber
	private double getSubscription() {
		return 3.50;
	}
	//Override toString method
	public String toString() {
		return "2.  " +getServiceType() + "  \t\t " + getAddress()
				+ "  \t\t\t " + getSubscription() ;
	}
	

}
