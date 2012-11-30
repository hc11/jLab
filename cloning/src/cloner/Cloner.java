package cloner;

public class Cloner {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Dummy d,d2;
		
		System.out.println("ShallowClone:");

		d = new Dummy(11);
		System.out.println(d);
		
		d2 = (Dummy)d.clone();
		System.out.println(d2);

		d2.poke();
		System.out.println(d);
		System.out.println(d2);
		

		System.out.println("Copy:");

		d = new Dummy(11);
		System.out.println(d);
		
		d2 = d.copy();
		System.out.println(d2);

		d2.poke();
		System.out.println(d);
		System.out.println(d2);

	
		System.out.println("Constructor:");

		d = new Dummy(11);
		System.out.println(d);
		
		d2 = new Dummy(d);
		System.out.println(d2);

		d2.poke();
		System.out.println(d);
		System.out.println(d2);
		
		
		System.out.println("Serialize:");

		d = new Dummy(11);
		System.out.println(d);
		
		d2 = (Dummy)SCopier.sCopy(d);
		System.out.println(d2);

		d2.poke();
		System.out.println(d);
		System.out.println(d2);		
	}

}
