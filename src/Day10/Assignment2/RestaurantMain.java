package Day10.Assignment2;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResWaiter q=new ResWaiter();
		new ResChef(q);
		new ResCustomer(q);

	}

}
