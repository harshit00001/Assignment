package Day12.Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Grosery> gr =new HashMap<Integer,Grosery>();
		gr.put(1, new Grosery("Rice",110));
		gr.put(2, new Grosery("Wheat",370));
		gr.put(3, new Grosery("Mustard Oil",170));
		gr.put(4, new Grosery("Biscuit",30));
		System.out.println("----Grosery Items----");
		gr.forEach((i,j)->System.out.println("Key = "+i+" =>"+" Item: "+ j.getItem()+ ",  Price: "+j.getPrice()));;
		
		Map<Integer,Electronics> e =new HashMap<Integer,Electronics>();
		e.put(1, new Electronics("Extension",300));
		e.put(2, new Electronics("Torch",160));
		e.put(3, new Electronics("Bulb",90));
		e.put(4, new Electronics("Trimmer",700));
		System.out.println("\n----Electronics Items----");
		e.forEach((i,j)->System.out.println("Key = "+i+" =>"+" Item: "+ j.getItem()+ ",  Price: "+j.getPrice()));;
		
		Map<Integer,Kids> k =new HashMap<Integer,Kids>();
		k.put(1, new Kids("Toy Car",50));
		k.put(2, new Kids("Pencil",30));
		k.put(3, new Kids("Bat",400));
		k.put(4, new Kids("Train Toy",850));
		System.out.println("\n----Kids Items----");
		k.forEach((i,j)->System.out.println("Key = "+i+" =>"+" Item: "+ j.getItem()+ ",  Price: "+j.getPrice()));;
		Map<String,Integer> adding =new HashMap<String,Integer>();
		Scanner sc =new Scanner(System.in);
		boolean flag=true;
		try {
			while(flag)
			{
				System.out.println("Chose the Correct Option: \n1>add Grosery \n2>Add Electonics \n3>add kids items \n4>Remove items \n5>Show Total Mount  \n6>Display all Item Details \n7>Exit\n");
				int input=sc.nextInt();
				if(input==1)
				{
					System.out.println("Enter the Grosery name: ");
					String inputgr=sc.next();
					for(int n1: gr.keySet())
					{
					Grosery val=gr.get(n1);
					if(val.getItem().equals(inputgr))
					{
						adding.put(val.getItem(), val.getPrice());
					System.out.println("Key = "+n1+" => Value = "+ val.getPrice());
					}
					}
					
				}
				else if(input == 2)
				{
					System.out.println("Enter the Electronics name: ");
					String inpute=sc.next();
					for(int n1:e.keySet())
					{
					Electronics val=e.get(n1);
					if(val.getItem().equals(inpute))
					{
						adding.put(val.getItem(), val.getPrice());
					System.out.println("Key = "+n1+" => Value = "+ val.getPrice());
					}
					}
				}
				else if(input==3)
				{
					System.out.println("Enter the Kids Item name: ");
					String inputk=sc.next();
					for(int n1: k.keySet())
					{
					Kids val=k.get(n1);
					if(val.getItem().equals(inputk))
					{
						adding.put(val.getItem(), val.getPrice());
					System.out.println("Key = "+n1+" => Value = "+ val.getPrice());
					}
					}
				}
				else if(input==4)
				{
					System.out.println("Enter the Item name to Remove the Item from Item list ");
					String str=sc.next();
					if(adding.containsKey(str))
					{
						adding.remove(str);
						System.out.println("Product Removed: ");
					}
					
					
				}
				else if(input==5)
				{
					int sum=0;
					for(String n1: adding.keySet())
					{
						int val=adding.get(n1);
						System.out.println("Key = "+n1+" => Value = "+ val);
						sum=sum+ val;
					}
					System.out.println("Totol Amount:"+ sum);
				}
				else if(input==6)
				{
					System.out.println("----Grosery Items----");
					gr.forEach((i,j)->System.out.println("Key = "+i+" =>"+" Item: "+ j.getItem()+ ",  Price: "+j.getPrice()));;
					System.out.println("----Electronics Items----");
					e.forEach((i,j)->System.out.println("Key = "+i+" =>"+" Item: "+ j.getItem()+ ",  Price: "+j.getPrice()));;
					System.out.println("----Kids Items----");
					k.forEach((i,j)->System.out.println("Key = "+i+" =>"+" Item: "+ j.getItem()+ ",  Price: "+j.getPrice()));;
					
				}
				else {
					System.out.println("Exit");
					flag=false;
				}
			}
		}
		catch(Exception e1)
		{
			System.out.println("Invalid");
		}

	}

}
