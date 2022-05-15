package classobjectconstructor;

public class UseHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House myHouse = new House ("whitehouse", 1236);
		myHouse.room ();
		
		House yourHOuse = new House ("the mellenium");
		yourHouse.bathRoom();
		
		House theHouse = new House ();
		theHouse.bathRoom();
		

	}

}
