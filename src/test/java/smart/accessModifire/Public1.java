package smart.accessModifire;

public class Public1 {
static int a = 10;
static int b = 15;

public void add() {
	System.out.println("Sum of a+b= "+(a+b));
}
	
public void add1(int a, int b) {
	System.out.println("Some of a+b= "+(a+b));
}

public void sub() {
	int a=200;
	int b=100;
	int c=a-b;
	System.out.println("subtraction a-b="+c);
}
public void sub1(int a, int b) {
	System.out.println("subtraction of a-b=" +(a-b));
	
}
public void multiples() {
	System.out.println("Multiples a*b= "+(a*b));
}
public void multiples1(int a, int b) {
	System.out.println("Multiples of a*b = "+(a*b));
}
public void division() {
	int a=100;
	int b=20;
	System.out.println("Division a/b="+(a/b));
}
public void division1(int a, int b) {
	System.out.println("Division a/b="+(a/b));
}
}
