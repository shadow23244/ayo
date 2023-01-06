package ayoconnect_training;

import java.util.Enumeration;
import java.util.Vector;

public class sample_list_vector 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(45);
		v.add("hi");
		v.add(14);
		
		v.set(2, 55);
		
		
		Enumeration en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
