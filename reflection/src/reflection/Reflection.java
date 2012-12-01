package reflection;
//import reflection.ClassByName.*;


public class Reflection {

	/**
	 * @param args
	 */
	public static void main(String[] args)	{
		// TODO Auto-generated method stub

		ClassByName cbn = new ClassByName();
		ClassByName cbn2;

		cbn.showMe();
		
		try {
			Class<?> nc = Class.forName("reflection.ClassByName");
			cbn = (ClassByName)nc.newInstance();
			cbn.showMe();
			
			cbn2 = (ClassByName)Class.forName("reflection.ClassByName2").newInstance();
			cbn2.showMe();

		}
		catch (Exception e) {
			System.err.println(e);
		}
		
		
	}

}
