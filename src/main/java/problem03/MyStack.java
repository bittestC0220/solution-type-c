package problem03;

public class MyStack {
	
	private String[] buffer;
	String[] stack;
	int size;
	int top;
	
	public MyStack( int size ) {
		stack = new String[size];
		this.size = size;
		int top = -1;
		
	}
	
	public boolean push(String item) {
        stack[++top] = item;
        return true;
	}

	public String pop() {
		Object item = stack[top];
		stack[top] = null;
		top--;
		return null;

	}

	public boolean isEmpty() {
		return false;
	}
	
	public int size() {
		return 0;
	}
}