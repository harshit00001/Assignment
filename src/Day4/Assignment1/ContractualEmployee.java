package Day4.Assignment1;

public class ContractualEmployee extends PersonalDetail{
	@Override
	double basicPay() {
		// TODO Auto-generated method stub
		pf=0.12*basic_pay;
		return salary-pf;
	}

	@Override
	double loanAmount() {
		// TODO Auto-generated method stub
		return basicPay()*loan_rate;
	}

}
