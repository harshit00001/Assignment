package Day5.Assignment1;

import java.util.Scanner;

public class CandidateMain  {

	public static void main(String[] args) throws InvalidSalaryException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Name : ");
		String name=sc.nextLine();
		System.out.print("\nGender : ");
		String gender=sc.nextLine();
		System.out.print("\nExpected Salary: ");
		int ex_salary=sc.nextInt();
		if(ex_salary<10000)
		{
			throw new InvalidSalaryException("Enter the Right Salary");
		}
		else
		{
			System.out.println(new Candidate(name,gender,ex_salary));
		}

	}

}
