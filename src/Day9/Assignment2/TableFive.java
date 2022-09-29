package Day9.Assignment2;

public class TableFive extends Thread{
	private String name;
	public int num;
	Thread t;
	
	TableFive(String name) {
		super(name);
		this.name=name;
		t=new Thread(this,"thread");
		System.out.println(this.name +" created");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=1;i<=5;i++) {
				num=5*i;
				System.out.println(this.name +" Running.. " + i);
			Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(this.name +" interupted..");
		}
		System.out.println(this.name +" Finished..");
		}
		

}
