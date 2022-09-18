
public class SevenDaySuscriber extends NewspaperSubscriber {
	
	//constructor with arg service type and address
	public SevenDaySuscriber (String serviceType,String address) {
		super(serviceType,address);
		
	}
	//return 4.50 as subscription rate in seven day subscriber
	private double getSubscription() {
		return 4.50;
	}
	//Override toString method
	public String toString() {
		return "1.  " +getServiceType() + "  \t " + getAddress()
		+ "  \t\t\t " + getSubscription() ;
	}
	
	
	

}
