package Day3.Assignment1;

public abstract class Account {
	public double r;
	public int p;
	public int t;
	abstract void calInterest();
	public Account(double r, int p, int t) {
		super();
		this.r = r;
		this.p = p;
		this.t = t;
	}
}
