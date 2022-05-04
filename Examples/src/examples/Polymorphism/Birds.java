package examples.Polymorphism;

public class Birds extends Animals {

	void bird() {
		System.out.println("i am Bird");
	}

	void sound() {
		System.out.println("kekeke");
	}

	void sound(String A) {
		System.out.println("The sound = " + A);
	}

}
