package Day1.Assignment1;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 5 Student Marks: ");
		Scanner in =new Scanner(System.in);
		Student stud1=new Student("Harsh",1,22,in.nextInt());
		Student stud2=new Student("Aaddya",2,22,in.nextInt());
		Student stud3=new Student("Abhay",3,21,in.nextInt());
		Student stud4=new Student("Chetan",4,22,in.nextInt());
		Student stud5=new Student("Debayan",5,22,in.nextInt());
		
	}

}
