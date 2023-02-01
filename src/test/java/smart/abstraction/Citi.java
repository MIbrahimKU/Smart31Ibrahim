package smart.abstraction;

public class Citi extends Abstmethod {

	@Override
	void getRofInterest() {
		
		System.out.println("Citi Bank house loan interest rates: 7.50%");
		
		}




	@Override
	int downpayment() {
		
		return 20;
	}




	@Override
	int monthpay(int a, int b) {
		int x = a+b;
		return x;
	}


	}
