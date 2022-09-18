import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default value for decision
		String decision="y";
		
		Scanner input= new Scanner (System.in);
		
		System.out.println(" *Calculator is on* ");
		//while loop for decision
		while(!decision.equals("N")) {
			//declare default value
			double result=0.0;
			String operation="";
			int count=0;
			
			System.out.println("Current result: "+result);
		
			//while loop for display R to end calculate result
			while(!operation.equals("R") && !operation.equals("r")) {
				
				//prompt user to input value operation
				operation=input.next();
				Calculator calculate= new Calculator(operation);
				try {//try block 
					result= calculate.calculateResult();
					new Calculator(result);
					//create method to calculate result result=calculateOperation (operation,result);
					count++;
					
				//if statement to avoid statement is print when input is r
					if (!(operation.equals("R")) && !(operation.equals("r"))) {
						if (count==1) {//if statement for first time display
							System.out.println(result);
							System.out.println("New result= "+result);
						}
						else {
							System.out.println(calculate.getResult());
							System.out.println("Updated result= "+calculate.getResult());
					}
						
				}
			}//end try block
			
			catch (UnknownOperatorException e){//catch block
				System.out.println(e.toString());
				System.out.println("Re-enter");
					
			}//end catch block
			
			}//end while loop for operation !=R
			
			System.out.println("Final result= "+result);
			System.out.println("Again? (Y/N)");
			decision=input.next().toUpperCase();
		
		}//end while loop for decision
		
		System.out.println("End of the program");

	}
/**method to calculate the operation
	public static double calculateOperation(String operation, double result) throws UnknownOperatorException {
		// TODO Auto-generated method stub
		String symbol=operation.substring(0,1);
		/**System.out.println(symbol);
		System.out.println(result);*/
		
		//if statement to throw to the exception
		/**if (!(symbol.equals("+")) && !(symbol.equals("-")) && !(symbol.equals("*")) && !(symbol.equals("/")) && 
				!(symbol.equals("R")) && !(symbol.equals("r"))) 
			throw new UnknownOperatorException(symbol);
		
		//if statement to display final result if user input r
		if (symbol.equals("R") || symbol.equals("r"))
			return result;
		//convert string to double value
		double num=Double.parseDouble(operation.substring(1,operation.length()));
	
		System.out.print("Result "+symbol+ " "+num+" = ");
		//if statement to calculate the result
		if (symbol.equals("+"))
			return result+=num;
		else if (symbol.equals("-"))
			return result-=num;
		else if(symbol.equals("*"))
			return result*=num;
		else
			return result/=num;
		
		
	}*/

}
