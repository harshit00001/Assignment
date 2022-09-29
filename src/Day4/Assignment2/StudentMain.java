package Day4.Assignment2;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args)
		{
			StudentFactory factobj =new StudentFactory();
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the Student Type: ");
			String StudentType=sc.nextLine();
			try
			{
				Student s=factobj.getStudent(StudentType);
				s.hostel_number=2;
				s.student_name="Harshit";
				s.room_number=33;
				s.registration_No=103;
				s.department="Computer Science";
				System.out.println(s.getStudentDetails());
//				System.out.println("Hostel_number : " + s.hostel_number + "Student Name: "+ s.student_name +"\nRoom Number: "+ s.room_number+ "\nRegistration Number: " + s.registration_No + "\nDepartment: " + s.department); 
			}
			catch(NullPointerException e)
		    {
		        System.out.print("Student Type not Found(Choose Hostellers Or DayScholars)");
		    }
		}
}
