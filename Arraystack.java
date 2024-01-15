import java.util.ArrayList;

public class Arraystack<t> implements Mystack<t>{
	int size = 0;
	int capacity;
	int top = -1;
	ArrayList<t> arr;
	public Arraystack(int capacity){
		this.capacity = capacity;
		arr = new ArrayList<>();

	}

	public void push(t data)
	{
		if(size>=capacity)
		{
			System.out.println("Stack overFlow");
		}
		else{
			top++;
			arr.add(top,data);
			size++;
		}
	}

	public t pop() throws Exception{
		if(top==-1)
		{
			throw new Exception("Stack Underflow");
		}
		size--;
		return arr.get(top--);
	}

	public boolean isFull(){
		if(size==capacity)
		{
			return true;

		}
		else{
			return false;
		}
	}

	public boolean isEmpty(){
		if(size==0)
		{
			return true;
		}
		else{
			return false;
		}
	}
	public t top(){
		return arr.get(top);
	}
}