import java.util.Date;
public class Transaction {
	//declare data field
	private Date date= new Date ();
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	Transaction (char type, double amount, double balance, String description) {//constructor with arg
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
		
	}
	//acessor method
	//return date
	public Date getDate() {
		return date;
	}
	//return type
	public char getType() {
		return type;
	}
	//return amount
	public double getAmount() {
		return amount;
	}
	//return balance
	public double getBalance() {
		return balance;
	}
	//return description
	public String getDescription() {
		return description;
	}
	//mutator method
	//set new date value
	public void setDate(Date date) {
		this.date = date;
	}
	//set new type
	public void setType(char type) {
		this.type = type;
	}
	//set new amount
	public void setAmount(double amount) {
		this.amount = amount;
	}
	//set new balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//set new description
	public void setDescription(String description) {
		this.description = description;
	}
	

}
