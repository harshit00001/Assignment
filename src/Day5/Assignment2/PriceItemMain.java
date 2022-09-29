package Day5.Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PriceItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int item_length=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Item Length: ");
		try
		{
		item_length=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the Integer value as item Length");
		}
		try
		{
		String[] item_name =new String[item_length];
		int[] item_price=new int[item_length];
			for(int i=0;i<item_name.length;i++)
			{	
					System.out.println("Enter Item name: ");
					item_name[i]=sc.nextLine();
				
			}
			for(int i=0;i<item_name.length;i++)
			{
	//			System.out.println("Enter Item name: ");
	//			item_name[i]=sc.nextLine();
				System.out.println("Enter Price: ");
				item_price[i]=sc.nextInt();
				
			}
			System.out.println("Enter the Index Value of item: ");
			int index=sc.nextInt();
			System.out.println("Item Name: " + item_name[index] + "\nItem Price: "+ item_price[index]);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter the Integer value as price");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBound: Type right Index Value");
		}
	}

}
