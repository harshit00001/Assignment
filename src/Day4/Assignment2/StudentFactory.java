package Day4.Assignment2;

public class StudentFactory {
	public Student getStudent(String StudentType)
	{
		if(StudentType==null)
		{
			return null;
		}
		if(StudentType.equalsIgnoreCase("Hostellers"))
		{ 
			return new Hostellers();
		}
		else if(StudentType.equalsIgnoreCase("DayScholars"))
		{
			return new DayScholars();
		}
		return null;
	}

}
