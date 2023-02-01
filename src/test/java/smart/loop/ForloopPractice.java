package smart.loop;

public class ForloopPractice {
	
/* Java Nested for Loop:-
 * If we have a for loop inside the another loop, it is known as nested for loop.
 * The inner loop executes completely whenever outer loop executes.  */
public void nestedLoop() {
	int i, j;
	for(i=1; i<=3;i++) {
		for(j=1;j<=4;j++) {
			System.out.println(i+"  "+j);
		}
	}
}

/* Make a Pyramid using '*' key */
public void pyramid() {
	int a,b;
	for(a=1;a<=10; a++) {
		for(b=1;b<=a; b++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

public void pyramidReverase () {
	int temp=10;
	for(int i=1; i<=temp; i++) {
		for(int j=temp;j>=i; j--) {
			System.out.print("*");
			}
	System.out.println();	
	}
	
}

public void printArraya() {
	//Declaring an array 
int arr[]= {12,13,15,18,21,44,56,87,99};
		//Printing array using for-each loop
for (int i:arr) {
System.out.println(i);
}
}

public void breakLoop() {
	  aa:  
	     for(int i=1;i<=3;i++){  
	         bb:  
	            for(int j=1;j<=3;j++){  
	                if(i==2&&j==2){  
	            break bb;  
	                    }  
	                  System.out.println(i+" "+j);  
	                }  
	        }  
	}  

public void reverseloop() {
	for(int i=3; i>0; i--) {
		//i=i+i;     //don't undustend ?
		System.out.println(i);
	}
}
public void reverseforloop() {
	for(int i=0; i<=100;i+=5) {
		System.out.println("Value"+i);
	}
}
public void whileloop() {
	int i=1;
	while(i<=100) {
		System.out.println("Value: "+i);
		i++;
	}
}
public void dowhileloop() {
	int i=1;
	do {
		System.out.println("value "+i);
		i++;
	} while (i<=10);
}
	public static void main(String[] args) {
		ForloopPractice forobj = new  ForloopPractice();
			//forobj.nestedLoop();
			//forobj.pyramid();
			//forobj.pyramidReverase();
			//forobj.printArraya();
			forobj.breakLoop();
			//forobj.reverseloop();
			//forobj.reverseforloop();
			//forobj.whileloop();
		//forobj.dowhileloop();
	}

}
