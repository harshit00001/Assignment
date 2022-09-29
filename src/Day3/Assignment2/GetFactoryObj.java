package Day3.Assignment2;

public class GetFactoryObj {
	public Sport getSport(String sportType)
	{
		if(sportType==null)
		{
			return null;
		}
		if(sportType.equalsIgnoreCase("Badminton"))
		{
			return new Badminton();
		}
		else if(sportType.equalsIgnoreCase("Football"))
		{
			return new Football();
		}
		return null;
	}
}
