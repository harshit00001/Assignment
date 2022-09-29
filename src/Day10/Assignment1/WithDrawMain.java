package Day10.Assignment1;

public class WithDrawMain {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WithdrawSyn obj=new WithdrawSyn();
		WithdrawThread t1=new WithdrawThread(1000,obj);
		WithdrawThread t2=new WithdrawThread(2000,obj);
		WithdrawThread t3=new WithdrawThread(4000,obj);
		WithdrawThread t4=new WithdrawThread(4000,obj);
		try
		{
			t1.t.join();
			t2.t.join();
			t3.t.join();
			t4.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Interrupted: ");
		}

	}

}
