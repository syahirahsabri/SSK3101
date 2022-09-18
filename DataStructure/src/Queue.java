
public interface Queue {
	
	public abstract void enqueue (Object object);
	public abstract Object getFront();
	public abstract Object dequeue ();
	public int size();

}
