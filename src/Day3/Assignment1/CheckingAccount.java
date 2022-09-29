package Day3.Assignment1;

public class CheckingAccount extends Account {
	private double s;
	public CheckingAccount(double r, int p, int t) {
		super(r, p, t);
	}
	public void calInterest()
	{
		s=(p*r*t)/100;
		System.out.println("The Interest for Checking Account of : " + r + "% is "+ s);
	}
	
	
}
