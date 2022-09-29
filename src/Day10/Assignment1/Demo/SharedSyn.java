package Day10.Assignment1.Demo;

public class SharedSyn {
	synchronized void shareMethod(String arg)
	{
		System.out.print("["+ arg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted: ");
		}
		System.out.println("]");
	}

}
