package Day5.Assignment1;
import java.util.Scanner;
public class Candidate {
	private String name;
	private String gender;
	private int ex_salary;
	
	public Candidate(String name, String gender, int ex_salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.ex_salary = ex_salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getEx_salary() {
		return ex_salary;
	}
	public void setEx_salary(int ex_salary) {
		this.ex_salary = ex_salary;
	}
	@Override
	public String toString() {
		return "Candidate Details: \nName=" + name + "\nGender=" + gender + "\nExpected_salary=" + ex_salary;
	}
	
}
