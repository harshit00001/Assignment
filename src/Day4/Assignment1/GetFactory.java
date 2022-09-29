package Day4.Assignment1;

public class GetFactory {
	public PersonalDetail getDetail(String EmployeeType)
	{
		if(EmployeeType==null)
		{
			return null;
		}
		if(EmployeeType.equalsIgnoreCase("Contractual"))
		{
			ContractualEmployee ce= new ContractualEmployee();
			ce.emp_Name="Harshit";
			ce.emp_id="101";
			ce.loan_rate=0.10;
			System.out.println("Name: " + ce.emp_Name + "\nID : " + ce.emp_id);
			return ce;
		}
		else if(EmployeeType.equalsIgnoreCase("Permanent"))
		{
			PermanentEmployee ep= new PermanentEmployee();
			ep.emp_Name="Abhay";
			ep.emp_id="102";
			ep.loan_rate=0.15;
			System.out.println("Name: " + ep.emp_Name + "\nID : " + ep.emp_id);
			return ep;
		}
		return null;
	}
}
