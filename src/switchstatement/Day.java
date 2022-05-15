package switchstatement;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day = "Mon";
		
		switch (day) {
		
		case "Mon":
		System.out.println("mentoring day");
		
		case "Tue":
		System.out.println("review day");
		
		case "Wed":
		System.out.println("code lab day");
		
		case "Thu":
		System.out.println("homework day");
		
		case "Fri":
		System.out.println("rest day");
		
		case "Sat":
		System.out.println("first class");
		
		case "Sun":
		System.out.println("Second day");
		
		default:
			System.out.println("invalid day");
		
		}

	}

}
