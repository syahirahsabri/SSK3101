
public class NewspaperSubscriber {
	//declare private data fields
	private String address;
	private double subscriptionRate;
	private String serviceType;
	
	
	public NewspaperSubscriber (String serviceType,String address) {//constructor with arg service type and address
		this.serviceType=serviceType;
		this.address=address;
		
	}
	//get and set method for address and subscription rate, get method for service type
	//return address
	public String getAddress() {
		return address;
	}
	//return subscription rate
	public double getSuscribtionRate() {
		return subscriptionRate;
	}
	//return service type
	public String getServiceType() {
		// TODO Auto-generated method stub
		return serviceType;
	}
	//assign new address
	public void setAddress(String address) {
		this.address = address;
	}
	//assign new subscription rate
	public void setSuscribtionRate(double suscribtionRate) {
		this.subscriptionRate = suscribtionRate;
	}
	//equal method to compare the address between service type
	public boolean equals(Object o) {
		if(getAddress()==address)
			return true;
		else
			return false;
	}
	
	
	

}
