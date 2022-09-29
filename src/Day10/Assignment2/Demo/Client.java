package Day10.Assignment2.Demo;

public class Client implements Runnable{
	Thread t;
	Q q;
	public Client(Q q)
	{
		this.q=q;
		t=new Thread(this,"Client");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			q.get();		
		}
		
	}

}
