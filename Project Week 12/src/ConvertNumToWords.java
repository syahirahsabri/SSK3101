/**
 * NAME: NOOR SYAHIRAH BINTI MOHD SABRI
 * MATRIC NO: 207542
 * ASSIGNMENT: LAB WEEK 12 (QUEST 1)
 */

import java.util.*;
public class ConvertNumToWords {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.print("Enter integer number: " );
		int num= input.nextInt();
		System.out.println(numToWords(num));

	}

	private static String numToWords(int num) throws Exception {
		// TODO Auto-generated method stub
		if (num<0)
			throw new Exception();
		else if (num<10) {
			if (num==0)
				return "zero";
			else if (num==1)
				return "one";
			else if (num==2)
				return "two";
			else if (num==3)
				return "three";
			else if (num==4)
				return "four";
			else if (num==5)
				return "five";
			else if (num==6)
				return "six";
			else if (num==7)
				return "seven";
			else if (num==8)
				return "eight";
			else 
				return "nine";
		}
		else { 
				return (numToWords(num/10)+" "+numToWords(num%10));

		}
		
		
	}

}


