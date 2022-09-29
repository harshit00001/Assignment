package Day6.Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class LibraryMain {
	public static void main(String[] args)
	{
		List<LibraryAddMember> nm =new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("Chose the Correct Option: \n1>add new Member \n2>View All member details \n3>view detail by address \n4>Exit\n");
			int input=sc.nextInt();
			if(input==1)
			{
				System.out.println("Enter the Number of Member you want to add in the library: ");
				int a=sc.nextInt();
				for(int i=0;i<a;i++)
				{
					System.out.println("Enter the \nname:  \nAddress:  \nUnique_id: \nage: ");
					String b=sc.next();
					String c=sc.next();
					int d=sc.nextInt();
					int e=sc.nextInt();
					nm.add(new LibraryAddMember(b,c,d,e));
				}
			}
			else if(input == 2)
			{
				for(LibraryAddMember lam: nm)
				{
					System.out.println(lam.toString());
				}
			}
			else if(input==3)
			{
				System.out.println("Enter the Address to view Detail of Member: ");
				String y=sc.next();
				for(LibraryAddMember lam: nm)
				{
					if(lam.getNm_address().equals(y))
					System.out.println(lam);
				}
			}
			else {
				System.out.println("Exit");
				flag=false;
			}
		}
	}

}
