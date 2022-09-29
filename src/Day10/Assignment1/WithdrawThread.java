package Day10.Assignment1;

public class WithdrawThread implements Runnable{
	int arg;
	WithdrawSyn obj;
	Thread t;
	public WithdrawThread(int arg, WithdrawSyn obj) {
		super();
		this.arg = arg;
		this.obj = obj;
		t=new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			obj.shareMethod(arg);
		} catch (CustomExce e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
