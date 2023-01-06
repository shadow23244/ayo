package ayoconnect_training;

public class sample_overloading 
{
	public void overload(int a) 
	{
		
		System.out.println(a +": method overloading with 1 paramater");
	}
	
	public void overload(int a, int b) 
	{
		
		System.out.println(a+" "+b+": method overloading with 2 paramaters");
	}
	
	public static void main(String[] args) 
	{
		sample_overloading a=new sample_overloading();
		a.overload(20);
		a.overload(20, 10);
	}

}
