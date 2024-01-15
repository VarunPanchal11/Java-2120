import java.util.Random;

public class Customer{
	private int arrivalTime;
	public int serviceTime;

	public Customer(int arrival)
	{
		this.arrivalTime = arrival;
		this.serviceTime = new Random().nextInt(5)+1;
	}
	public boolean done()
	{
		return(serviceTime--<=0);
	}
	public int getArrivalTime()
	{
		return arrivalTime;
	}
}