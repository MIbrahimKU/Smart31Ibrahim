package smart.abstraction;

public class Tdbank extends Abstmethod {

	@Override
	void getRofInterest() {
		System.out.println("TB Bank house loan interest rates : 8.75%");
		}

	@Override
	int downpayment() {
		return 10;
	}

	@Override
	int monthpay(int a, int b) {
		return a+b ;
	}

}
