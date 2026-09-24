public class oopconcept {
	public static void main(String[] args) {
		Animal animal = new Dog("Bruno");
		animal.showName();
		animal.sound();
	}
}
abstract class Animal {
	private String name; 

	Animal(String name) {
		this.name = name;
	}

	void showName() {
		System.out.println("Name: " + name);
	}

	abstract void sound();
}

class Dog extends Animal {
	Dog(String name) {
		super(name);
	}
	@Override
	void sound() {
		System.out.println("Dog says: Woof");
	}
}
