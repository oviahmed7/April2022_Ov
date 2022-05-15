package homework;

import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner (System.in);
		int choice2 = 0;
		
		while(true) {
			System.out.println("Welcome choose conversion mode");
			
			System.out.println("Pick 1(C-F) or 2 (F-C): ");
			
		int choice1= input.nextInt();
		
		if (choice1==1) {
			System.out.println("Enter temputer Celsius");
		double celsius = input.nextDouble();
		double farhenheit=(celsius *9/5)+32;
		System.out.println("this is C-F:" +farhenheit );
		}
		
		else if (choice1==2) {
			System.out.println("Enter temputer farhenheit");
			double farhenheit = input.nextDouble();
			double celsius=(farhenheit-32)*5/9;
			System.out.println("this is F-C:" +celsius );
		}
		while(true) {
			
		
		System.out.println("do you want to convert other temperatures ? 1- Yes/2- No");
		
		choice2=input.nextInt();
		
		   if(choice2 == 1) {
               System.out.println("Welcome choose conversion mode");
               System.out.println("Pick 1(C-F) or 2(F-C): ");
               
               int choice3 = input.nextInt();
               if(choice3 == 1) {
            	   
            	   System.out.println("Enter temperture Celsius: ");
                   double celsius = input.nextDouble();
                   double fahrenheit = (celsius * 9/5) +32;
                   System.out.println("This is C-F: "+ fahrenheit);
               }
               
               else if(choice3==2) {
		
            	   System.out.println("Enter temperture Fahrenheit: ");
                   double fahrenheit = input.nextDouble();
                   double celsius = (fahrenheit - 32) + (5/9);
                   System.out.println("This is F-C: "+ celsius);
               }
               
               else {
            	   
            	   System.out.println("Invalid input please select 1 or 2");
               }
               if(choice2 == 2) {	   
               
            	   System.out.println("Goodbye have a nice day");
               }
                   
               }
		}
		


	}

	}
}
	
