
public class Main {
	public static void main(String[] args) {
		Human human1 = new Human("Rick", 65, 70);
		System.out.println(human1.name);
		human1.eat();
		
		Human human2 = new Human("Bike", 20, 20);
		System.out.println(human2.name);
		human2.eat();
	}
}
