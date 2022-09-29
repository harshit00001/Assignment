package Day10.Assignment2.Demo;

public class Q {
	int n;
	boolean flag =false;
	synchronized int get()
	{
		if(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Got: "+n);
		flag=false;
		notify();
		return n;
	}
	synchronized void put(int n)
	{
		if(flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n=n;
		flag=true;
		System.out.println("put: "+n);
		notify();
		
	}
}
