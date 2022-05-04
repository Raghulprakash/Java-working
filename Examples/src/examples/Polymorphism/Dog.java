package examples.Polymorphism;

public class Dog extends Animals {

	void dog() {
		System.out.println("i am Dog");
	}

	void sound() {
		super.sound();
		System.out.println("Barking");
	}

	void eat() {
		System.out.println("non veg");
	}

	void eat(String b) {
		System.out.println(b);
	}

}
