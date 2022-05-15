package condition;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		
		//capture user input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int x= sc.nextInt();
		
		
		
		if (x>0) {
			System.out.println("this  number is postive");
		}else if (x <0){
			System.out.println("this number is negavtive");
		}else {
			System.out.println("this number is equals to 0");
			//if (condition){body}
			//if (condition){body} else //if (condition){body}
			//if (condition){body} else {body}
			//if (condition){body} else if //if (condition){body}...else {body}
		}

	}

}
