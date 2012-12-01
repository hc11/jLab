package reflection;

public class ClassByName {

	protected String bcbn = "Base";
	
	public ClassByName() {
		System.out.println("CBN");
	}
	
	public void showMe() {
		System.out.println(bcbn + " : " + this);
	}
}
