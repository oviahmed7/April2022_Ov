package datatype.primitive;

public class variables {

	public static void main(String[] args) {
		//syntax: variabletype variableName = variableValue
		// numbers
		//whole number 
		byte b = 123; // 1 byte . for byte you can only go up till 127 and - 128
		short s = 2542; //2 bytes
		int x = 1; // 4 bytes
		long l = 65425L; //8 bytes (2-2-52) *
		
		//variable declaration
		int i;
		//variable assignmnet
		i = 52;
		//use strong names / camel case
		int ageOfTheDog= 25;
		
		

		//fraction
		float f = 1.255454F ; // 4 bytes
		double d = 1.12445; // 8 bytes
		
		//character
		char a1 ='&'; // 2bytes
		char a2 ='+';
				
		// boolean
		boolean boo = true; // 1 bit (1/8 byte)
		
		//non-primitive variable
		//chain of characters 
		String str = "Hello";
		String str2 = "World";
		
		
		System.out.println(str);
		System.out.println(ageOfTheDog);
		System.out.println(i);
		System.out.println(a1);
		System.out.println(boo);
		
		System.out.println(25+85);
		System.out.println(a1+a2);
		System.out.println(str + " " +str2);
		System.out.println(str+b);
		
		//arithmetic operators: +,-, /,*, %, ++,--
		ageOfTheDog--;
		System.out.println(ageOfTheDog);
		
		//assignment operator: =
		
		//comparison operators: <,>,<=,>=,!=,==
		String s1 ="Hello";
		String s2 ="Hello";
		System.out.println(s1!=s2);
		System.out.println (10>10);
		
		//logical operators:&&, ||, !
		
		//java logic
		System.out.println(10<9);

	}

}
