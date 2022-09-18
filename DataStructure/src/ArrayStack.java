
public class ArrayStack implements Stack {
	private Object[] a;
	private int size;
	private int capacity;
	
	public ArrayStack (int capacity) {
		a= new Object [int capacity];
	}
	
	public boolean isEmpty() { 
		  return (size == 0); 
		}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		  if (size == 0) throw new      IllegalStateException("stack is empty");
		     return a[size-1]; 

	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if (size == 0) throw new IllegalStateException("stack is empty");      
		Object object = a[--size];    
		a[size] = null; 
	  return object;

	}

	@Override
	public void push(Object object) {
		// TODO Auto-generated method stub
		if (size == a.length) resize(); 
      	a[size++] = object;

	}

	private void resize() {
		// TODO Auto-generated method stub
		Object[] aa = a;
		 
		     		a = new Object[2*aa.length];
		 
		     		System.arraycopy(aa, 0, a, 0, size);

	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
