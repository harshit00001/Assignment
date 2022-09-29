package Day10.Assignment2;

public class ResCustomer implements Runnable {
	Thread t;
	ResWaiter q;
	public ResCustomer(ResWaiter q)
	{
		this.q=q;
		t=new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<1)
		{
			q.getServe();	
			i++;
		}
		
	}

}
