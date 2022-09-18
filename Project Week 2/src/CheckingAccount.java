
public class CheckingAccount extends Account {
	private int overDraftLimit=100;
	public CheckingAccount() {
		
	}
	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}
	public int getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(int overDarftLimit) {
		this.overDraftLimit=overDraftLimit;
	}
	public void withdraw(double amount) {
		if(getBalance()-amount > overDraftLimit)
			setBalance(getBalance()-amount);
		else
			System.out.println("The transaction is failed! Amount withdrawn exceed draft limit.");
		

}
	public String toString() {
		return super.toString()+"\nOver Draft Limit: "+getOverDraftLimit();
	}
}
