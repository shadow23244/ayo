package ayoconnect_training;

import java.util.ArrayList;
import java.util.ListIterator;

public class sample_list 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(20);
		a.add("hello");
		a.add(56);
		
		a.add(1, "changed the index");
		a.set(3, 45);
		
		
		ListIterator list= a.listIterator();
		
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("-----------------------------");
		for(int i=0; i<=a.size()-1; i++)
		{
			System.out.println(a.get(i));
		}
	}

}
