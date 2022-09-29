package Day4.Assignment1;

public class PermanentEmployee extends PersonalDetail {

	@Override
	double basicPay() {
		pf=0.12*basic_pay;
		// TODO Auto-generated method stub
		return salary-pf;
	}

	@Override
	double loanAmount() {
		// TODO Auto-generated method stub
		return basicPay()*loan_rate;
	}

}
