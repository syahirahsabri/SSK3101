
public class RunningTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int n=4;
		for (int i=n/2; i<=n; i++) {
			System.out.println("i="+i);
			for (int j=1; j<=n; j = 2 * j) { 
				System.out.println("j="+j);
		        for (int k=1; k<=n; k = k * 2) {   
		        	System.out.println("k="+k);
		        	count++;
		        	
			}
			}
		}

	}

}
