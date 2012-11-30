package cloner;

import java.io.*;

public class SCopier {

	
public static Object sCopy(Object co)
{
	try {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(co);
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		return ois.readObject();
	}
	catch (Exception e){
		System.err.println(e);
		return null;
	}
}	
	
}
