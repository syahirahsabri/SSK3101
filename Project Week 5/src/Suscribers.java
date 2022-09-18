
public class Suscribers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implicit casting for sevendays, weekdays and weekend object
		NewspaperSubscriber sevendays= new SevenDaySuscriber("Seven Day Suscriber","Taman Seri Serdang");
		NewspaperSubscriber weekdays= new WeekDaySuscriber ("Weekday Suscriber","Taman Seri Serdang");
		NewspaperSubscriber weekend= new WeekEndSuscriber("Weekend Suscriber","Taman Seri Serdang");
		
		System.out.println(" \tSERVICE TYPE\t | \t\tADRESS\t\t  | \tSUBSCRIPTION RATE (RM per week) ");
		//assign the objects to the generic method
		PrintDetails(sevendays);
		PrintDetails(weekdays);
		PrintDetails(weekend);
		//print the equals method in the superclass
		System.out.println("\nComparison between: \n1. \"Seven Days Subscriber\" and \"Weekend Subscriber\" is "+sevendays.equals(weekend));
		System.out.println("2. \"Weekdays Subscriber\" and \"Seven Days Subscriber\" is "+weekdays.equals(sevendays));
		System.out.println("3. \"Weekend Subscriber\" and \"Weekdays Subscriber\" is "+weekend.equals(weekdays));
		

	}

	private static void PrintDetails(Object o) {
		// TODO Auto-generated method stub
		//check if object o is related to each classes
		if(o instanceof SevenDaySuscriber)
			System.out.println(((SevenDaySuscriber)o).toString());
		else if (o instanceof WeekDaySuscriber)
			System.out.println(((WeekDaySuscriber)o).toString());
		else if(o instanceof WeekEndSuscriber)
			System.out.println(((WeekEndSuscriber)o).toString());
		
	}

}
