package Day14.com.training.amdocs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Student1")
public class Student {
	@Id
	@Column(name="stud_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studId;
	
	@Column(name="stud_name")
	private String studName;
	
	@Column(name="stud_grade")
	private String studGrade;
	
	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudGrade() {
		return studGrade;
	}

	public void setStudGrade(String studGrade) {
		this.studGrade = studGrade;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Student(String studName, String studGrade) {
		super();
		this.studName = studName;
		this.studGrade = studGrade;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studGrade=" + studGrade + "]";
	}


}
