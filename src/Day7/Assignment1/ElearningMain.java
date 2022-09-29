package Day7.Assignment1;
import java.util.*;
public class ElearningMain {
	public static void main(String[] args) throws CustomException
	{
		List<Student> nm =new ArrayList<>();
		List<Course> nm2 =new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		boolean flag=true;
		try {
			while(flag)
			{
				System.out.println("Chose the Correct Option: \n1>add new Student \n2>Enter name of course and student name to entroll   \n3>view Student \n4>Exit\n");
				int input=sc.nextInt();
				if(input==1)
				{
					System.out.println("Enter the Number of Member you want to add in the ELearning portal ");
					int a=sc.nextInt();
					for(int i=0;i<a;i++)
					{
						System.out.println("Enter the \nStudent Name:  \nEnrolllment_id: \nAge: ");
						nm.add(new Student(sc.next(),sc.nextInt(),sc.nextInt()));
					}
				}
				
				else if(input==2)
				{
					System.out.println("Enter the Name of student name: ");
					String z=sc.next();
					for(Student lam: nm)
					{
						if(lam.getName().equals(z)) {
							System.out.println("Enter the Couse name, Registration id, Trainer name");
							nm2.add(new Course(lam.getName(),lam.getEnrol_id(),lam.getAge(),sc.next(),sc.next(),sc.next()));
							System.out.println(nm2);
						}
					}
					
				}
				else if(input==3)
				{
					System.out.println("Enter the Enrollment Id: ");
					for(Course lam: nm2)
					{
						Collections.sort(nm2,new StudentEnrollmentComparator());
						System.out.println(lam);
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
			System.out.println("Invalid input: ");
		}
	}
}
