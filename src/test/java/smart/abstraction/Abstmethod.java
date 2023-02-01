package smart.abstraction;

public abstract class Abstmethod {
	
	abstract void getRofInterest(); //Get Rate of Interest > abstract void method
	abstract int downpayment();		//	DownPayment > abstract integer method
	abstract int monthpay(int a, int b);
	
	static void common() {
		System.out.println("Home loan interest rate based on credit score and yearly income");
		
	}
	
		
	

}

 