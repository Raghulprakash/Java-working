package examples.Abstraction;

public class Abstract4 extends Abstract3 {

	public void name(){
		System.out.println("DOG");
	}
	public void hi() {
		System.out.println("hi");
	}
	public static void main(String[]args)
	{
		Abstract4 a = new Abstract4();
		a.eat();
		a.sound();
		a.name();
		a.hi();
	}
}
