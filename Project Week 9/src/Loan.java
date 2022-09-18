
public abstract class Loan implements LoanConstant {
	//declare all variables
	private int loanNo;
	private String lastName;
	private double amount;
	private double rate;
	private int term;
	
	public Loan () {//default constructor
		
	}
	//constructor with arg 
	public Loan(int loanNo, String lastName, double amount, int term) {
		this.loanNo = loanNo;
		this.lastName = lastName;
		this.amount = amount;
		this.term = term;
	}
	/**get method
	 * return Loan
	 */
	public int getLoanNo() {
		return loanNo;
	}
	public String getLastName() {//return last Name
		return lastName;
	}
	public double getAmount() {//return amount
		if(amount>=100000)
			return -1;
		else
			return amount;
	}
	public double getRate() {//return rate
		return rate;
	}
	public String getTerm() {//return term
		switch (term) {
		case 1: return "SHORT TERM LOAN";
		case 3: return "MEDIUM TERM LOAN";
		case 5: return "LONG TERM LOAN";
		default: return "SHORT TERM LOAN";
		}	
	}
	/**accessor method
	 * set loan no
	 */
	
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public void setLastName(String lastName) {//set last name
		this.lastName = lastName;
	}
	public void setAmount(double amount) {//set amount
		this.amount = amount;
	}
	public void setRate(double rate) {//set rate
		this.rate = rate;
	}
	public void setTerm(int term) {//set rate
		this.term = term;
	}
	@Override
	public String toString() {
		return "Loan Number\t\t: "+getLoanNo()+
				"\nCustomer Last Name\t: "+getLastName()+
				"\nAmount of Loan\t\t: "+getAmount()+
				"\nInterest Rate\t\t: "+getRate()+ "%"+
				"\nLoan Term\t\t: "+getTerm();
	}
	
	
	
	

}
