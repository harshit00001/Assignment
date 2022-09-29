package Day9.Assignment2;
public class TableOddEven extends Thread{
	private String name;
	Thread t;
	TableOddEven(String name) {
		super(name);
		this.name=name;
		t=new Thread(this,"thread Odd/Even");
		System.out.println(this.name +" is created2");
		t.start();
	}

	@Override
	public void run() {

		TableFive tf=new TableFive("Thread: Table Five: ");
		// TODO Auto-generated method stub
		try {
			
			for(int i=1;i<=5;i++) {
				if(((tf.num)%2)==0 )
				{
				System.out.println(this.name +" Even Running2.. " + tf.num);
				
				}
				else if(tf.num%2==1&&tf.isAlive()) {
					System.out.println(this.name +" Odd Running2.. " + tf.num);
					tf.join(1000);
				}
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(this.name +" interupted2..");
		}
		System.out.println(this.name +"  Finished2..");
		}
		

}
