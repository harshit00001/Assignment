package Day7.Assignment1;

public class Student {
	private String name;
	private int enrol_id;
	private int age;
	public Student(String name, int enrol_id, int age) {
		super();
		this.name = name;
		this.enrol_id = enrol_id;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnrol_id() {
		return enrol_id;
	}
	public void setEnrol_id(int enrol_id) {
		this.enrol_id = enrol_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
