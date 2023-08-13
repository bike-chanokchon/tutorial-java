
public class Human {

	String name;
	int age;
	double weight;
	
	// Constructor
	Human(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name + " is eating");
	}
}

//Human human1 = new Human("Rick", 65, 70);
//System.out.println(human1.name);
//human1.eat();
//
//Human human2 = new Human("Bike", 20, 20);
//System.out.println(human2.name);
//human2.eat();
