package Assignment;

public class Student {
	private String Name;
	private int Roll_no;
	private int Age;
	private int Marks;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll_no() {
		return Roll_no;
	}
	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public void marks_Check(String Name,int Roll_no,int age,int marks)
	{
		this.Marks=marks;
		if (Marks<30)
		{
			System.out.println("Name: " + Name + "\nRollNo: " + Roll_no + "\nage: " + age+ "\nMarks: " + marks + " ,Marks Less than 30 Cannot be accepted");
		}
		else
		{
			System.out.println("Name: " + Name + "\nRollNo: " + Roll_no + "\nage: " + age+ "\nMarks: " + marks +" ,Marks Acceptable ");
		}
	}

}
