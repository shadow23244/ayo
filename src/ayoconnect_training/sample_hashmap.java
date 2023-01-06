package ayoconnect_training;

import java.util.HashMap;
import java.util.Set;

public class sample_hashmap 
{
	public static void main(String[] args) 
	{
		String s1= "wake up to reality reality";
		
		String[] a = s1.split(" ");
		
		HashMap<String, Integer> ab = new HashMap();
		
		for(int i=0; i<=a.length-1; i++)
		{
			String a1 = a[i];
			 Integer a2 = ab.get(a1);
			 
			 if(a2==null)
			 {
				 ab.put(a1, 1);
			 }
			 else
			 {
				 ab.put(a1, ab.get(a1)+1);
			 }
		}
		
		Set<String> keys = ab.keySet();
		for(String key : keys)
		{
			System.out.println(key+" "+ab.get(key));
		}
	}

}
