/*package Assignment2;

public class Employee {

	public static void main(String[] args) {
		String[][] arr=new String[2][5];
		arr[0][0]="harsh"; arr[1][0]="1";
		arr[0][1]="harsh2"; arr[1][3]="3";
		arr[0][2]="harsh3"; arr[1][3]="2";
		arr[0][3]="harsh4"; arr[1][3]="0";
		String temp,tem;
		System.out.println(arr);
		for(int i=0;i<arr[1].length;i++)
		{
			for(int j=1;j<arr[1].length-1;j++)
			{
				if(Integer.parseInt(arr[1][j])<Integer.parseInt(arr[1][j-1]))
				{
					tem=arr[0][j-1];
					arr[0][j-1]=arr[0][j];
					arr[0][j]=tem;
					temp=arr[1][j-1];
					arr[1][j-1]=arr[1][j];
					arr[1][j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
		

}
*/

