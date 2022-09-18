

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account ("George",1122,1000);//create Account object
	
		//set annual interest rate with 105
		account1.setAnnualInterestRate(1.5);
		
		//withdraw method with amount 5,4,2
		account1.withdraw(5);
		account1.withdraw(4);
		account1.withdraw(2);
	
		//deposit method with amount 30,40,50
		account1.deposit(30);
		account1.deposit(40);
		account1.deposit(50);
		
	
		//print the statement
		System.out.println("\t *Account Summary* \t");
		System.out.println("Account Holder Name: "+account1.getName());
		System.out.println("Anual Interest Rate: "+account1.getAnnualInterestRate()+"%");
		System.out.println("Account Balance    : RM"+account1.getBalance());
		System.out.println("\n\t *List of transaction* \t");
		for (int i=0; i<account1.getTransaction().size();i++) {
			System.out.println((account1.getTransaction()).get(i).getDate());
			System.out.println("Type	   : "+account1.getTransaction().get(i).getType());
			System.out.println("Balance    : RM"+account1.getTransaction().get(i).getBalance());
			System.out.println("Amount     : RM"+account1.getTransaction().get(i).getAmount());
			System.out.println("Description: "+account1.getTransaction().get(i).getDescription()+"\n" );
		}
		
	}//end main method
	

}
