import java.util.*;
public class ArrayListSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare and create list object
		ArrayList <Double> list= new ArrayList <>();
		Scanner input= new Scanner (System.in);
		
		
		//prompt user to input five numbers
		System.out.println("Enter five numbers: ");
		for (int i=0; i<5;i++) {
		list.add(input.nextDouble());
		}
		
		//print the sum of the numbers
		System.out.println("Sum of the numbers : "+sum(list));

	}
	//calculate sum of the numbers
	private static double sum(ArrayList<Double> list) {
		// TODO Auto-generated method stub
		double sum=0;
		for (int i=0; i<list.size();i++) {
			sum+=list.get(i);
		}
		return sum;
	}

}
