/**NAME: NOOR SYAHIRAH BINTI MOHD SABRI
 * MATRIC NO: 207542
 * LAB WEEK: 9
 * QUESTION NO:2
 * 
 */
import java.util.*;
public class CreateLoans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan[] loans=new Loan[5];//create loan object array
		Scanner input=new Scanner (System.in);
		double interestRate;
		
		System.out.println("----------Sanchez Construction Loan Co.------------");
		System.out.print("Current Interest Rate (%): ");//prompt user for initial interest rate 
		interestRate=input.nextDouble();
		
		for(int i=0;i<loans.length;i++) {//for loop to allow user enter loans details
			//declare variables
			char loanType;
			int loanNo;
			String name;
			double amount;
			int term;
			
			System.out.print("\n **B for Business Loan | P for Personal Loan**\nLoan Type: ");
			loanType=input.next().charAt(0);
			System.out.print("Loan Number: ");
			loanNo=input.nextInt();
			System.out.print("Customer Last Name:");
			name=input.next();
			System.out.print("Loan Amount: ");
			amount=input.nextDouble();
			System.out.print("Loan Term (years): ");
			term=input.nextInt();
			
			//assign loanType method to loan array
			loans[i]=loanType(loanType,loanNo,name,amount,term,interestRate);
			
		}//end for loop
		printDetails(loans,interestRate);//print detail method
	
	}//end main method
	//print details method
	private static void printDetails(Loan[] loans, double interestRate) {
		System.out.println("\n------------Customers' Loan Details--------------");
		System.out.println("Current Interest Rate: "+interestRate);
		for(int i=0;i<loans.length;i++) {//for loop to display loans details
			System.out.println("\n"+loans[i].toString());
			System.out.printf("Total Loan\t\t: %.2f",
					((loans[i].getRate()/100)*loans[i].getAmount()+loans[i].getAmount()),"\n");
			System.out.println();
			
		}//end for loop
		
	}//end print details method

//loanType method
	private static Loan loanType(char loanType, int loanNo, String name, double amount, int term, double interestRate) {
		Loan e;
		//selection for loan subclasses
		if (loanType=='B' || loanType=='b') {
			e=new BusinessLoan(loanNo,name,amount,term,interestRate);
			return e;
		}else if (loanType=='P'|| loanType=='p') {
			e=new PersonalLoan (loanNo,name,amount,term,interestRate);
			return e;
		}
		else
			return null;
		
	}//end loanType method

	
	

}
