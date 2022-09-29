package Day9.Assignment1;

public class PriorityThread extends Thread{
	private String name;
	Thread t;
	
	PriorityThread(String name,int priority) {
		super(name);
		this.name=name;
		setPriority(priority);
		t=new Thread(this,"thread");
		System.out.println(this.name +" is created");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<=3;i++) {
				System.out.println(this.name +" is Running " + i);
			Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(this.name +"is interupted..");
		}
		System.out.println(this.name +"is Finished..");
		
		}
		
	}

