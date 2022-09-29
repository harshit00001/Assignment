package Day3.Assignment1;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account A1=new CheckingAccount(4,1000,2);
		A1.calInterest();
		Account A2=new SavingAccount(5,1000,2);
		A2.calInterest();

	}

}
