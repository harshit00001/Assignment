package Day10.Assignment1.Demo;

public class ThreadSyn implements Runnable{
	String arg;
	SharedSyn obj;
	Thread t;
	public ThreadSyn(String arg, SharedSyn obj) {
		super();
		this.arg = arg;
		this.obj = obj;
		t=new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.shareMethod(arg);
		
	}

}
