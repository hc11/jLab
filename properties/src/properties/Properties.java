package properties;

//import java.util.*;
import java.io.*;

public class Properties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Properties tp = new java.util.Properties();
		tp.setProperty("a","A");

		try
		{
			FileOutputStream fs = new FileOutputStream("t.properties");
			tp.store(fs, "Simple");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	
		PropertyLoader pl = new PropertyLoader();
		pl.load();
		
		long l = System.currentTimeMillis();
		System.out.println(Long.toHexString(l));
		int i = (int)l;
		System.out.println(Integer.toHexString(i));
		
	}	
}

class PropertyLoader {
	 
	 public void load()	{
		 this.getClass().getResourceAsStream("t.properties");
	 }
}
