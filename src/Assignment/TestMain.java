package Assignment;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud1=new Student();
		Student stud2=new Student();
		Student stud3=new Student();
		Student stud4=new Student();
		Student stud5=new Student();
		Scanner in =new Scanner(System.in);
		System.out.println("Enter 5 Student Marks: ");
		stud1.marks_Check("Harsh",1,22,in.nextInt());
		stud2.marks_Check("Aaddya",2,22,in.nextInt());
		stud3.marks_Check("Abhay",3,21,in.nextInt());
		stud3.marks_Check("Chetan",4,22,in.nextInt());
		stud4.marks_Check("Debayan",5,22,in.nextInt());
		stud5.marks_Check("preeti",6,22,in.nextInt());
		
	}

}
