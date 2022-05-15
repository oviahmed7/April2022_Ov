package classobjectmethod;

public class UseCalculator {

	public static void main(String[] args) {
		// object is instance of a class 
		//syntax : ClassName objectName = new ClassName();
		
		Calculator ahmed = new Calculator ();
 int myTotal =ahmed.addition();
 System.out.println(myTotal);
 
 int mySurface = ahmed.surface ();
 System.out.println();
 
 int myTemp= ahmed.cToF();
 System.out.println(myTemp);
	}

}
