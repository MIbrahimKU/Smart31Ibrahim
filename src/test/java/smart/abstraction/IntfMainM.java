package smart.abstraction;

public class IntfMainM extends IntfMethod {
	public static void main(String[] args) {
		
		
		IntfMainM obj2= new IntfMainM ();
						obj2.a();
						obj2.xyz();
		
	}

	@Override
	void xyz() {
		
		int x = 10;
		while (x<=20) {
			System.out.println("X Value is : "+x);
			
			x=x+1;;
		}
		
	}

}
