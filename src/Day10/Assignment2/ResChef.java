package Day10.Assignment2;

public class ResChef implements Runnable{
	Thread t;
	ResWaiter q;
	public ResChef(ResWaiter q)
	{
		this.q=q;
		t=new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<8)
		{
			q.putPrepared(i++);
		}
		
	}

}
