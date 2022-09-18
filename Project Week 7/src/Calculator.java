
public class Calculator {
	double result;
	String operation;
	
	
	public Calculator(){
		
	}

	public Calculator(String operation) {
		// TODO Auto-generated constructor stub
		this.operation=operation;
		
	}
	public Calculator(double result) {
		this.result=result;
	}
	
	public double getResult() {
		return result;
	}

	public double calculateResult() throws UnknownOperatorException {
		String symbol=operation.substring(0,1);
		
		if (!(symbol.equals("+")) && !(symbol.equals("-")) && !(symbol.equals("*")) && !(symbol.equals("/")) && 
				!(symbol.equals("R")) && !(symbol.equals("r"))) 
			throw new UnknownOperatorException(symbol);
		if (symbol.equals("R") || symbol.equals("r"))
			return result;
		
		double num=Double.parseDouble(operation.substring(1,operation.length()));
		System.out.print("Result "+symbol+ " "+num+" = ");
		
		if (symbol.equals("+"))
			return result+=num;
		else if (symbol.equals("-"))
			return result-=num;
		else if(symbol.equals("*"))
			return result*=num;
		else
			return result/=num;
		

}
}
