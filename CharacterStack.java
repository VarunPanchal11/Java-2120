public class CharacterStack {

	private char[] arr;
	private int top = -1;
	private int size;

	public CharacterStack(int size)
	{
		this.size = size;
		arr = new char[size];
	}

	public void push(char input)
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

	public char pop() throws Exception{
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

	public char top() throws Exception
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
}
