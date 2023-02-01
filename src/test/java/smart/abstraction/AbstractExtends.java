package smart.abstraction;

public class AbstractExtends extends AbstractTest{

	@Override
	int abc() {
		int a=10; 
		int b=20;
		int c=a+b;
		return c;
	}

	@Override
	void xyz() {
		System.out.println("Have a good day");
		
	}

}
