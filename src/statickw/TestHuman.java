package statickw;

public class TestHuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//access non static attributes : use the object
		Human human = new Human ();
		human.person1();
		
		
		
		//access.static attribute: use the class name only
		human.person2();

	}

}
