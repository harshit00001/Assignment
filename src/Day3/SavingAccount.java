package Day3;

public class SavingAccount extends Account {
	private double s;
	
	public SavingAccount(double r, int p, int t) {
		super(r, p, t);
	}

	@Override
	public void calInterest()
	{
		s=(p*r*t)/100;
		System.out.println("The Interest for Saving Account of : " + r + "% is "+ s);
		
	}

}
