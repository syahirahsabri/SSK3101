import java.util.*;
public class ArrayListDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		ArrayList <Integer> list= new ArrayList <>();
		
		
		//prompt user to input 10 integers
		System.out.println("Enter 10 integers numbers: ");
		
		for (int i=0;i<10;i++)
			list.add(input.nextInt());
		
		//create duplicate method
		removeDuplicate (list);
		
		//print array list
		System.out.print("The distint integers are ");
		for (int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
	}
	//remove duplicate method	
	public static void removeDuplicate (ArrayList <Integer> list) {
		//34 5 3 5 6 4 33 2 2 4
		for (int i=0;i<list.size();i++) {
			for(int j=i+1; j<list.size();j++) {	
				if (list.get(i)==list.get(j))
					list.remove(j);
			
			}
			}
		
		
		
		}

	}


