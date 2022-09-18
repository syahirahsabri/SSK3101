
public class BusinessLoan extends Loan{
//constructor with arg
	public BusinessLoan(int loanNo, String lastName, double amount, int term, double rate) {
		super(loanNo, lastName, amount, term);
		super.setRate(rate+1);
	}
	
}
