
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

//Friend friend1 = new Friend("Bro");
//Friend friend2 = new Friend("2ro");
//System.out.println(Friend.numberOfFriend);
//
//Friend.displayFriend();
