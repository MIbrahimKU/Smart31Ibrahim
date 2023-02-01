package smart.oop;

/*
 * method overriding 
 * use extends key word 
 * same method name same parameter same data type */

public class Polymorphism2 extends Polymorphism1{
static void sub(int a, int b, int c) {
	System.out.println("(A+B)-C :"+((a+b)-c));
	}

static void sub (int a, int b) {		// this is overriding from polymorphism1 class
	System.out.println("Sum A+B :"+(a+b));
	
}
public static void main(String[] args) {  //Main Method 
	Polymorphism2.sum(20, 30);
	Polymorphism2.sum(10, 20, 30);
	
	Polymorphism2.sub(10, 20);
	Polymorphism2.sub(20, 10, 10);
	
	
}
}
