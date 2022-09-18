
public class PersonalLoan extends Loan {
//constructor with arg
	public PersonalLoan(int loanNo, String lastName, double amount, int term,double rate) {
		super(loanNo, lastName, amount, term);
		super.setRate(rate+2);
	}
	
	
}
