
public class ArrayQueue implements Queue {

	private Object[] objQ;
	private int frontIndex;
	private int backIndex;
	private int size;
	
	public ArrayQueue (int capacity) {
		objQ = new Object[capacity];
		frontIndex = 0;
		backIndex = capacity - 1;
		size = 0;
		
	}
	@Override
	public void enqueue(Object object) {
		// TODO Auto-generated method stub
		ensureCapacity();
		backIndex = (backIndex + 1) % objQ.length;
		objQ[backIndex] = object;
		size++;
		
	}

	private void ensureCapacity() {
		// TODO Auto-generated method stub
		if (isFull()) {
			Object[] oldQ = objQ;
			objQ = new Object[2 * oldQ.length];
			for (int i = 0; i < oldQ.length; i++) {
			objQ[i] = oldQ[frontIndex];
			frontIndex = (frontIndex + 1) % oldQ.length;
			}
			frontIndex = 0;
			backIndex = oldQ.length - 1;
			}
	}
	@Override
	public Object getFront() {
		// TODO Auto-generated method stub
		Object front = null;
		if (isEmpty()) throw new IllegalStateException("queue is empty");
		front = objQ[frontIndex];
		return front;
	}

	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		Object front;
		if (isEmpty()) throw new IllegalStateException("queue is empty");
		front = objQ[frontIndex];
		frontIndex = (frontIndex + 1) % objQ.length;
		size--;
		return front;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
	public boolean isFull() {
		return size == objQ.length;
		}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
