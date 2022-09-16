package Assignment2;

import java.util.Scanner;

public class FirstLetterUpper {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=in.nextLine();
		String Str1[]=str.split("\\s");
		String temp1="";
		for(int i=0;i<Str1.length;i++)
		{
			String j=Str1[i].substring(0,1);
			String k=Str1[i].substring(1);
			temp1+=j.toUpperCase()+ k +" ";
		}
		
		System.out.println("String is : "+ temp1);
		

	}

}
