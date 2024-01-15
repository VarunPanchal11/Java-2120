public class IntegerStack {
	
	private int[] arr;
	private int top = -1;
	private int size;

	public IntegerStack(int size)
	{
		this.size = size;
		arr = new int[size];
	}

	public void push(int input)
	{
		if(top==size)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			arr[++top] = input;
		}
	}

	public int pop() throws Exception{
		if(top==-1)
		{
			throw new Exception("Stack UnderFlow");
		}

		int idx = top;
		top--;

		return arr[idx];
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int top() throws Exception
	{
		if(top==-1)
		{
			throw new Exception("Stack Empty");
		}
		else
		{
			return arr[top];
		}
	}

	public int size()
	{
		return top+1;
	}
}
