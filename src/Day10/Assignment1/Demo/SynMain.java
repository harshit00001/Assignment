package Day10.Assignment1.Demo;

public class SynMain {
	public static void main(String[] args)
	{
		SharedSyn obj=new SharedSyn();
		ThreadSyn t1=new ThreadSyn("Spirit",obj);
		ThreadSyn t2=new ThreadSyn("of",obj);
		ThreadSyn t3=new ThreadSyn("abc",obj);
		try
		{
			t1.t.join();
			t2.t.join();
			t3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted: ");
		}
	}

}
