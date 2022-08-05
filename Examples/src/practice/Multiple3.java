package practice;

public class Multiple3 implements Multiple, Multiple1, Multiple2 {
	public void vehicaltype() {
		System.out.println(" This is a Two wheeler ");
	}

	public void vehicalname() {
		System.out.println(" R15 V3 ");
	}

	public void fuel() {
		System.out.println(" Runs in petrole ");
	}

	public static void main(String[] args) {
		Multiple3 obj = new Multiple3();
		obj.vehicalname();
		obj.vehicaltype();
		obj.fuel();

	}

}
