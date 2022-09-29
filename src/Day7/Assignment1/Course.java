package Day7.Assignment1;


public class Course extends Student{
	private String c_name;
	private String c_Reg_id;
	private String c_trainer;
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_Reg_id() {
		return c_Reg_id;
	}
	public void setC_Reg_id(String c_Reg_id) {
		this.c_Reg_id = c_Reg_id;
	}
	public String getC_trainer() {
		return c_trainer;
	}
	public void setC_trainer(String c_trainer) {
		this.c_trainer = c_trainer;
	}
	public Course(String name, int enrol_id, int age, String c_name, String c_Reg_id, String c_trainer) {
		super(name, enrol_id, age);
		this.c_name = c_name;
		this.c_Reg_id = c_Reg_id;
		this.c_trainer = c_trainer;
	}
	@Override
	public String toString() {
		return "Course [c_name=" + c_name + ", c_Reg_id=" + c_Reg_id + ", c_trainer=" + c_trainer + ", getName()="
				+ getName() + ", getEnrol_id()=" + getEnrol_id() + ", getAge()=" + getAge() + "]";
	}
	
}
