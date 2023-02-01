package smart.loop;

public class LoopPractice {
	
	public void getswap(int a,int b) {					//Swap two/three number ? method 
		System.out.println("Value befour swap a="+a);
		System.out.println("Value befour swap b="+b);
		int temp;
		temp=a; a=b; b=temp;
		//a=a+b;b=a-b; a=a-b; 				// swap two value without using any variable 
		System.out.println("");
		System.out.println("Value after awap a="+a);
		System.out.println("Value after awap b="+b);
		
	}
	
/*	STEP 1: Get a String word as a parameter. & SET variable count =0.
	STEP 2: Use FOR Loop : SET i=0; Checking condition i<word.length(); i=i+1; 
	STEP 3: IF (word.charAt(i)== 'e') then count =count +1.  */
	
	public void find(String word) {				// Method name is find(String word)-->parameter type::we pass value
		int count = 0;							// Integer type variable count value set 0.
		for(int i=0; i<word.length();i++) {		// word.length()-->java defiled method, use to count value length
		if(word.charAt(i) == 'e')				// word.charAt(i) --> java defiled method, use to comparing value
			count++;							// increase count value. 
		}
		
		System.out.println("Number of e  ="+count);
	}
	
/* First, we find the remainder of the given number by using the modulo (%) operator.
	Multiply the variable reverse by 10 and add the remainder into it. Divide the number by 10.*/
	
	public void reverseNo(int number) {							//Reverse Number Method 
		int reverse=0, remainder;
		
		while(number !=0) {
			remainder=number%10;
			reverse= reverse*10+remainder;
			number=number/10;
			//System.out.println("Step   :- "+reverse);
			}
		System.out.println("The reverse of the given number is:" + reverse);
	}
	
	public void reversstring() {
		
	}
												// Find a Odd and Even Number to given value?
	public void EvenOdd (int number) {  
				   		    
		    //Check if the number is divisible by 2 or not  
		    if(number%2==0){  
		        System.out.println(number+"even number");  
		    }else{  
		        System.out.println(number+"odd number");  
		    }  
		}  
	
	public void voter(int age) {
		if (age>=18) {
			System.out.println("you are eligible for voter registration of USA");
		}
		else 
			System.out.println("you are not eligible for voter registration, becouse you are less then 18 years old");
		
	}
	public void dayName(int num) {
		if (num==1) { System.out.println("Monday");}
		else if(num==2) { System.out.println("Tuesday");}
		else if (num==3) {System.out.println("Wednesday");}
		else if (num==4) {System.out.println("Thursday");}
		else if (num==5) {System.out.println("Friday");}
		else if (num==6) {System.out.println("Saturday");}
		else if (num==7) {System.out.println("Sunday");}
		else {System.out.println("Invalid day range");}
	}

	
	public static void main(String[] args) {				//Main Method 
		
		LoopPractice obj = new LoopPractice();
		//obj.getswap(10, 20);
		//obj.find("united states of america");
		//obj.reverseNo(4321);
		//obj.EvenOdd(15);
		//obj.voter(17); //Find 
		obj.dayName(0); //Enter a day range between 1-7
		
	}

}
