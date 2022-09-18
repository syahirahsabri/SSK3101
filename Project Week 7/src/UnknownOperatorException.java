
public class UnknownOperatorException extends Exception {
	private String symbol;
	
	//constructor with arg
	public UnknownOperatorException (String symbol) {
		super (symbol+" is an unknown operation");
		this.symbol=symbol;
	}

	
	

}
