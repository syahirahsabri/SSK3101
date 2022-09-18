/**NAME: NOOR SYAHIRAH BINTI MOHD SABRI
MATRIC NUMBER: 207542
LAB WEEK: 8
QUESTION NO: 1
 * */

import java.util.*;
import java.io.IOException;
import java.net.*;
public class RankBabyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num=1;
		String name;
		//while loop for prompt user
		while (num!=0) {
			System.out.print("Enter the name: ");//prompt input from user
			name=input.next();
			System.out.println(babyNameRank(name));//declare method to find rank
			System.out.print("\nPress 0 to exit. Press 1 to continue");
			num=input.nextInt();
			System.out.println();
		}
		System.out.println("End of program");
		

	}//end main method

	private static String babyNameRank(String name) {//method to find rank
		//declare all variables
		String result="";
		String boysName,girlsName;
		int rank,popuB,popuG;
		try {//try block for URL exception
			//create url object
				URL url = new URL ("http://liveexample.pearsoncmg.com/data/babynamesranking2010.txt");
				Scanner sc=new Scanner (url.openStream());//scanner object to read from url
				//while loop to read from url
				while (sc.hasNext()) {
					rank=sc.nextInt();
					boysName=sc.next();
					popuB=sc.nextInt();
					girlsName=sc.next();
					popuG=sc.nextInt();
					
					if (boysName.contains(name)|| girlsName.contains(name)) {
						result= name+" is ranked no. "+rank;
						break;
					}
					else
						result= "The name "+name+" is not listed in the ranking";
					
				}//end while loop
			}//end try block
			catch (MalformedURLException e) { 
				System.out.println("Invalid URL");
			}catch (IOException e) {
				System.out.println("Input invalid");
			}
			
		//return result
		return result;
	}//end babyNameRank method

}//end class
