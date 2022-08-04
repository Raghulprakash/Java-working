package examples.Encapsulation;

public class Dataencapsulation{

	public static void main(String[] args) 
	{
		Encapsulation a = new Encapsulation();
		a.setName("Raghul");
		a.setReg(196);
		a.setSection('A');
		
		System.out.println(a.getName());
		System.out.println(a.getReg());
		System.out.println(a.getSection());
		System.out.println("  ");
		
		Encapsulation b = new Encapsulation();
		System.out.println(b.getName());
		System.out.println(b.getReg());
		System.out.println(b.getSection());
	}

}
