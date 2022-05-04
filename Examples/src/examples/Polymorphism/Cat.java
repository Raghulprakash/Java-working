package examples.Polymorphism;

public class Cat extends Animals {

	void cat() {
		System.out.println("i am Cat");
	}

	void sound() {
		System.out.println("Meow");
	}

	void eat() {
		super.eat();
		System.out.println("veg");
	}

}
