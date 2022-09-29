package Day3.Assignment2;

import java.util.Scanner;

public class MainFactory {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		GetFactoryObj factobj =new GetFactoryObj();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sport name Between Football and Badminton : ");
		String sportType=sc.nextLine();
		try
		{
		Sport s=factobj.getSport(sportType);
		s.getName();
		}
		catch(NullPointerException e)
        {
            System.out.print("Sport Type not Found(Choose Football or Badminton");
        }
	}

}
