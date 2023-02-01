package smart.oop;

/*
 * Method Overloading practice
 * method write in a same (one) class // method have a same name 
 * different parameter or different data type. */

public class Polymorphism1 {


static void	sum(int a, int b) {
	System.out.println("Sum of value :"+(a+b));
	}
static void sum (int a, int b, int c) {
	System.out.println("Sum of value :"+(a+b+c));
	}

static void sum(int a, int b,int c, int d){
	System.out.println("Sum value :"+(a+b+c+d));
}
public static void main(String[] args) {
	Polymorphism1.sum(5,900000);
	Polymorphism1.sum(800, 400, 900);
	Polymorphism1.sum(8700, 5400, 700, 999999999);
}
}
