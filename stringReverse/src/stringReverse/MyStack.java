package stringReverse;

public class MyStack {

	private String[] arr;
	private int nItems;
	
	public MyStack(int maxSize) {
		arr = new String[maxSize];
		nItems = 0;
	}
	public void push(String str) {
		arr[++nItems] = str;
	}
	public String pop() {
		return arr[nItems--];
	}
	public boolean isEmpty() {
		return (nItems == 0);
	}
}
