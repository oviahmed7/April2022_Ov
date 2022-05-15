package classobjectmethod;

public class Calculator {
//java class is a blueprint
// class attributes
//1- variable
	
	int number1 = 10;
	int number2 = 25;
	
	int length = 65414;
	int width = 69554;
	int c= 23;
	
	
//2 methods : A method is reusable block of code that runs when called
	// methodType method name (){ code to execute }
	
	
	
	int addition() {
		int total = number1 + number2;
		return total;
	}
	
	int mySurface() {
		int total = length * width;
		return total;
	}
	//length * width
	int cToF() {
		int f =(c * 9/5)+32;
		return f;
	}
	

	

}
