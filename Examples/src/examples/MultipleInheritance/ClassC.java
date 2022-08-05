package examples.MultipleInheritance;

public class ClassC implements ClassA, ClassB {

	public void add() {
		int a, b, c;
		a = 4;
		b = 6;
		c = a + b;
		System.out.println("add:" + c);
		System.out.println(" ");
	}

	public void sub() {
		int a, b, c;
		a = 4;
		b = 6;
		c = a - b;
		System.out.println("sub:" + c);
		System.out.println(" ");
	}

	public void multiply() {
		int a, b, c;
		a = 4;
		b = 6;
		c = a * b;
		System.out.println("multiply:" + c);
		System.out.println(" ");
	}

	public void divide() {
		int a, b, c;
		a = 4;
		b = 6;
		c = a / b;
		System.out.println("divide:" + c);
		System.out.println(" ");
	}

	public void ifclass() {
		int a, b;
		a = 4;
		b = 6;
		if (a <= b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		System.out.println(" ");
	}

	public void forloop() {
		int a, i;
		a = 4;
		for (i = 0; i <= a; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ClassC a = new ClassC();
		a.add();
		a.sub();
		a.multiply();
		a.divide();
		a.ifclass();
		a.forloop();
	}
}
