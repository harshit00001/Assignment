package Day10.Assignment2.Demo;

public class CommunicationTest {

	public static void main(String[] args) {
		Q q=new Q();
		new Developer(q);
		new Client(q);
		System.out.println("Press Ctrl-C to Stop");
	}
}
