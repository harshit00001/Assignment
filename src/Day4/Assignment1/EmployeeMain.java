package Day4.Assignment1;

import java.util.Scanner;


public class EmployeeMain {
	public static void main(String[] args)
	{
	GetFactory factobj =new GetFactory();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee Type(Choose between Contractual or Permanent): ");
	String EmployeeType=sc.nextLine();
	try
	{
	PersonalDetail s=factobj.getDetail(EmployeeType);
	System.out.println("Enter the Salary and basic Pay: ");
	s.salary=sc.nextDouble();
	s.basic_pay=sc.nextDouble();
	System.out.println("CTC : " + s.salary + "\nNet_Salary : " + s.basicPay()+"\nLoan Amount : "+s.loanAmount()); 
	}
	catch(NullPointerException e)
    {
        System.out.print("Employee Type Type not Found(Choose Contractual Or Permanent");
    }
	}
}
