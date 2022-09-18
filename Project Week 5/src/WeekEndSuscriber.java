
public class WeekEndSuscriber extends NewspaperSubscriber {
	private double subscription;
	
	//constructor with arg service type and address
	public WeekEndSuscriber (String serviceType,String address) {
		super(serviceType,address);
		
	}
	//return 2.00 as subscription rate in weekend subscriber
	private double getSubscription() {
		return 2.00;
	}
	//Override toString method
	public String toString() {
		return "3.  " +getServiceType() + "  \t\t " + getAddress()
		+ "  \t\t\t " + getSubscription() ;
	}
	

}
