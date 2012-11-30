package cloner;

import java.io.Serializable;

public class Dummy implements Cloneable, Serializable
{
	private static final long serialVersionUID = 1L;

	private int shallowInt;
	private Dummy dDummy; 

	private Dummy()
	{
//		this(11);
	}

	public Dummy(Dummy id)
	{
		shallowInt = id.shallowInt;
		if (id.dDummy != null)
			dDummy = new Dummy(id.dDummy);
	}
	
	private Dummy(int isi, Dummy id)
	{
		shallowInt = isi;
		if (id != null)
			dDummy = id.copy();
	}
	
	public Dummy(int s)
	{
		shallowInt = s;
		if (s<40)
			dDummy = new Dummy(s+11);
	}

	public void poke()
	{
		shallowInt++;
		if (dDummy != null)
			dDummy.poke();
	}

	public String toString()
	{
		String ts =	Integer.toString(shallowInt);
		if (dDummy != null)
			ts = ts +" " + dDummy.toString();
		return ts;
	}	

	public Dummy copy()
	{
		return new Dummy(shallowInt,dDummy);
	}

	
	/*
	public int geti()
	{
		return shallowInt;
	}
	
	public Dummy getd()
	{
		return dDummy;
	}
*/
	
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch (Exception e)
		{
			System.err.println(e);
			return null;
		}
	}
	
}
