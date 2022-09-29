package Day6.Assignment1;

public class Students {
	private String name;
	private String roll;
	private int age;
	public Students(String name, String roll, int age) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", roll=" + roll + ", age=" + age + "]";
	}
	

}
