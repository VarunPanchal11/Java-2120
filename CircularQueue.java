public class CircularQueue{
	private int data[];
	int size = 0;
	public int front = 0;
	public int back = 0;

	public CircularQueue(int n)
	{
		data = new int[n];
	}

	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isFull()
	{
		if(size==data.length)
		{
			return true;
		}
		else{
			return false;
		}
	}

	public void enqueue(int n)
	{
		if(isFull())
		{
			System.out.println("Queue Full");
		}
		else{
			data[back] = n;
			back = (back+1)%data.length;
			size++;
		}
	}

	public int dequeue() throws Exception
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			throw new Exception("Queue is Empty");
		}
		else
		{
			int value = data[front];
			front = (front+1)%data.length;
			size--;
			return value;
		}
	}

	public int front () throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is Empty");
		}

		return data[front];

	}
}