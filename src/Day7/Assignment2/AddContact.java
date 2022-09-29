package Day7.Assignment2;

public class AddContact {
	private String c_name;
	private int c_num;
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_num() {
		return c_num;
	}
	@Override
	public String toString() {
		return "Contact Details:  [c_name=" + c_name + ", c_num=" + c_num + "]";
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public AddContact(String c_name, int c_num) {
		super();
		this.c_name = c_name;
		this.c_num = c_num;
	}

}
