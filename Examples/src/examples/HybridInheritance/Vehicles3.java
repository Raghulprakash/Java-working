package examples.HybridInheritance;

public class Vehicles3 extends Vehicles1
{
   void E() 
    {
	System.out.println(" Manual ");
    }
   void F() 
   {
	System.out.println(" Uses Manpower ");
   }
public static void main (String []args)
{
Vehicles3 x = new Vehicles3();
x.A();
x.B();
x.E();
x.F();
}
}