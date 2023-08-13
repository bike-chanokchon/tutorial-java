
public class Friend {
	String name;
	static int numberOfFriend;
	
	Friend(String name) {
		this.name = name;
		
		numberOfFriend++;
	}
	
	static void displayFriend() {
		System.out.println(numberOfFriend);
	}
}
