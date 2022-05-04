package examples.Polymorphism;

public class Allanimals {

	public static void main(String[] args) {
		Dog a = new Dog();
		Cat b = new Cat();
		Birds c = new Birds();
		a.properties();
		a.dog();
		a.sound();
		a.eat();
		System.out.println("  ");
		b.properties();
		b.cat();
		b.sound();
		b.eat();
		System.out.println("  ");
		c.properties();
		c.bird();
		c.sound();
		c.eat();
		c.sound("Kech kech");
		a.eat("petigree");

	}

}
