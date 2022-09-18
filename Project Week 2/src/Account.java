import java.util.ArrayList;
import java.util.Date;

public class Account {
	//declare data field
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private String name;
	private Date dateCreated=new Date();//create date
	private ArrayList <Transaction> transaction = new ArrayList <>();
	
	//default constructor
	public Account (){	
	}
	//constructor with argument
	public Account (int id, double balance){
		this.id= id;
		this.balance= balance;
	}
	//constructor with argument name, id,balance
	public Account (String name, int id, double balance) {
		this.id=id;
		this.balance= balance;
		this.name=name;
	}
	
	//setId method
	public void setId (int id) {
		this.id=id;
	}
	//getId method
	public int getId() {
		return this.id;
	}
	//setBalance method
	public void setBalance(double balance) {
		this.balance=balance;
	}
	//getBalance method
	public double getBalance () {
		return this.balance;
	}
	//return name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//setAnnualInterestRate method
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate= annualInterestRate;
	}
	//getAnnualInterestRate method
	public double getAnnualInterestRate () {
		return this.annualInterestRate;
	}
	//dateCreated method
	public Date getDateCreated() {
		return dateCreated;
	}
	//getMonthlyInterestRate method
	public double getMonthlyInterestRate() {
		return (annualInterestRate/12)/100;
	}
	//getMonthlyInterest method
	public double getMonthlyInterest () {
		return this.balance* getMonthlyInterestRate();
	}
	//return transaction
	public ArrayList<Transaction> getTransaction() {
		return transaction;
	}
	//withdraw method
	public void withdraw(double amount) {
		this.balance-=amount;
		transaction.add(new Transaction ('W',amount,balance, "Withdrawal"));
	}
	
	//deposit method
	public void deposit (double amount) {
		this.balance+=amount;
		transaction.add(new Transaction ('D',amount,balance, "Deposit"));
	}
	
	public String toString() {
		return "Account holder name= " + getName() + "\nBalance= " + getBalance() + "\nAnnual Interest Rate= " + getAnnualInterestRate()
				+"\nTransaction Details: "+getTransaction();
	}
	

}//end account class
