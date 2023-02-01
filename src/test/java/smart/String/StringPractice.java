package smart.String;

public class StringPractice {
	public static void main(String[] args) {
		
//		String str ="Apple";
//		String str1="Apple";
		//add two String value
//		String add=str.concat(str1);
//		System.out.println(add);
		//chaking condition //true
//		System.out.println(str==str1);
//		String str2 = new String("Apple");
//		System.out.println(str1==str2);
		//checking value
//		System.out.println(str2.equals(str2));
		
		//stringTest();
		//stringBulder();
		//stringBuffer();
		//stringLeangth();
		split();
	}
	
	public static void stringTest() {
		String name="Ibrahim";
		//concat method use for add data//
		name.concat("Khalil"); 
		//String pool is immutable:: name veriable have a old value.
		System.out.println(name);
		
			}
	public static void stringBulder() {
		StringBuilder name =new StringBuilder("Ibrahim");
		//append method use for add value
		name.append(" Khalil");   
		//stringBulder is a Modifible/mutable:: name have a new value.
		System.out.println(name);
	}
	public static void stringBuffer() {
		StringBuffer name = new StringBuffer("Ibrahim");
		//append method use for add value
		name.append(" Khalil"); 
		//StringBuffer Modifible/mutable:: name varible have a new value.
		System.out.println(name);
	}
	public static void stringLeangth() {
		String country = "United State of America";
		// find the length of string
		int x=country.length(); 
		// Select(pick) '9' index value;
		char abc=country.charAt(9); 
		// find number of index(?Always show first index numbel )
		int x1=country.indexOf("i"); 
		boolean abc1 = country.contains("K"); // find/Search value
		String abc2 = country.toUpperCase();
		String abc3 = country.toLowerCase();
		
		
		//convert string to int or double
		String num="100";
		int n=Integer.parseInt(num);
		double n1=Double.parseDouble(num);
		//System.out.println(50+n1);
		
		//convert  int or double to String 
		int a=100; double aa=100.50;
		String value = String.valueOf(a);
		String value1=String.valueOf(aa);
		//System.out.println(50+value1);
		
	}
	static void split(){
		String country = "United State of America";
		String[] split = country.split(" ");
		for(int i=0;i<split.length;i++) {
		System.out.println(split[i]);}
		int count=0;
		for(int j=0;j<country.length();j++) {
			if(country.charAt(j)=='e') {
			System.out.println(country.charAt(j)+"::"+count);
			System.out.println("Index of e::"+j);
			count++;
				
			}
			
		}
}
}
