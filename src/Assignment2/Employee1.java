package Assignment2;

public class Employee1 {

	public static void main(String[] args) { // TODO Auto-generated method stub String[] arr= new String[3]; arr[0]="harsh"; arr[1]="Aaddya"; arr[2]="Abhay";
		String[] arr= new String[3]; 
		arr[0]="harsh"; 
		arr[1]="Aaddya"; 
		arr[2]="Abhay";
		int[] arr2= new int[3];
		arr2[0]=3;
		arr2[1]=2;
		arr2[2]=1;
		int temp=0;
		String temp2;
		for(int i=0;i<arr2.length;i++)
		{
		  		for(int j=1;j<arr2.length;j++)
		  		{
		  			if(arr2[j-1] > arr2[j])
		  			{  
		                  temp = arr2[j-1];  
		                  arr2[j-1] = arr2[j];  
		                  arr2[j] = temp;
		                  temp2 = arr[j-1];  
		                  arr[j-1] = arr[j];  
		                  arr[j] = temp2;
		  			}
		  		
		  		}
		} 
		for(int i=0;i<arr2.length;i++) 
		{ 
			System.out.println(arr[i] +" "+ arr2[i]); 
		}

	}
}


