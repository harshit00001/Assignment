package Day4.Assignment1;

public abstract class PersonalDetail {
	public String emp_Name;
	public String emp_id;
	public double salary,pf,basic_pay,loan_rate;
	abstract double basicPay();
	abstract double loanAmount();
	
}
