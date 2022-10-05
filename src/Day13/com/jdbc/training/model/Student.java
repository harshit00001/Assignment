package Day13.com.jdbc.training.model;

public class Student {
	private String studId;
	private String studName;
	private String studAddres;
	private String departments;
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	@Override
	public String toString() {
		return " [Student Id= " + studId + ", Name= " + studName + ", Address= " + studAddres + ", Department= "
				+ departments + "]";
	}
	public Student(String studId, String studName, String studAddres, String departments) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddres = studAddres;
		this.departments = departments;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudAddres() {
		return studAddres;
	}
	public void setStudAddres(String studAddres) {
		this.studAddres = studAddres;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}

}
