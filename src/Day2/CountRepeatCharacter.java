package Day2;

import java.util.Scanner;

public class CountRepeatCharacter 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the String: "); 
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			while(i+1<str.length() && str.charAt(i)==str.charAt(i+1))
			{
				i++;
				count++;
			}
			System.out.print( str.charAt(i) + "" + count +"" );
		}
	}
}
