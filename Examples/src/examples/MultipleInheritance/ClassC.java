package examples.MultipleInheritance;

public class ClassC implements ClassA, ClassB {

	public void print() {
		int a, b, c;
		a = 4;
		b = 6;
		c = a + b;
		System.out.println(c);
	}

	public void see() {
		int a, b, c;
		a = 4;
		b = 6;
		c = a - b;
		System.out.println(c);
	}

	public void hi() {
		int a, b, c;
		a = 4;
		b = 6;
		c = a * b;
		System.out.println(c);
	}

	public void bye() {
		int a, b, c;
		a = 4;
		b = 6;
		c = a / b;
		System.out.println(c);
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

	}
	public void forloop() {
		int a,i;
		a = 4;
		for(i=0;i<=a;i++)
		{
		System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ClassC a = new ClassC();
		a.print();
		a.see();
		a.hi();
		a.bye();
		a.ifclass();
		a.forloop();
	}
}
