package Day7.Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class ContactMain {

	public static void main(String[] args) {
		List<AddContact> nm =new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		boolean flag=true;
		try {
			while(flag)
			{
				System.out.println("Chose the Correct Option: \n1>add new Contact Member \n2>Display All member details \n3>Search by Name \n4>Remove the Contact by Name \n5>Exit\n");
				int input=sc.nextInt();
				if(input==1)
				{
						System.out.println("Enter the \nname:  \ncontact_number:  ");
						String b=sc.next();
						int c=sc.nextInt();
						nm.add(new AddContact(b,c));
				}
				else if(input == 2)
				{
					Collections.sort(nm,new ContactNameComparator());
					for(AddContact lam: nm)
					{
						System.out.println(lam.toString());
					}
				}
				else if(input==3)
				{
					System.out.println("Enter the Name to view Detail of Contact Member: ");
					String y=sc.next();
					for(AddContact lam: nm)
					{
						if(lam.getC_name().equals(y))
						System.out.println(lam);
					}
				}
				else if(input==4)
				{
					System.out.println("Enter the Name to Detail the Contact Member: ");
					String z=sc.next();
					Iterator<AddContact> it =nm.iterator();
					while(it.hasNext())
					{
						if(it.next().getC_name().equals(z)) {
							it.remove();
						System.out.println(it.next());
						}
					}
				}
				else {
					System.out.println("Exit");
					flag=false;
				}
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Wrong Input!");
		}
	}

}
