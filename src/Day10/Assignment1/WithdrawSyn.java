package Day10.Assignment1;

public class WithdrawSyn {

	int p=10000;
	synchronized void shareMethod(int arg) throws CustomExce
	{
		if(arg<=p)
		{
			p=p-arg;
			System.out.println("Withdraw Amount: "+ arg);
			System.out.println(" Remaining Amount: "+ p);
		}
		else if(arg>p) {
			throw new CustomExce("not Enough Money");
		}
		
			try
			{	
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread Interrupted: ");
			}
			catch(Exception e)
			{
				System.out.println("Not Enough Money");
			}
			
	}
}
