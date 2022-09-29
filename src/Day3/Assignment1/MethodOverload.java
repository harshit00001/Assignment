package Day3.Assignment1;

public class MethodOverload {
	
	void arg(double a,double b)
	{
		System.out.println("The sum of two Arg is "+ (a+b));
		System.out.println("The Avg of two Arg is "+ (a+b)/2);
	}
	void arg(double a,double b,double c)
	{
		System.out.println("The sum of three Arg is "+ (a+b+c));
		System.out.println("The Avg of three Arg is "+ (a+b+c)/3);
	}
	void arg(double a,double b,double c,double d)
	{
		System.out.println("The sum of four Arg is "+ (a+b+c+d));
		System.out.println("The Avg of four Arg is "+ (a+b+c+d)/4);
	}
	
	
}
