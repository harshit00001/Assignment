package Day6.Assignment1;

public class StudentAssign2 {
	private String name;
	private String roll;
	private String college;
	private int age;
	public StudentAssign2(String name, String roll, String college, int age) {
		super();
		this.name = name;
		this.roll = roll;
		this.college = college;
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", college=" + college + ", age=" + age + "]";
	}
	
	
}
