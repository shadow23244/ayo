package ayoconnect_training;

public class sample_static_nonstatic 
{
	static int a = 12;
	int b = 24;
	
	public void nonstatic() 
	{
		System.out.println("calling static variable in a non static method :"+a);
		System.out.println("calling non static variable in a static method :"+b);
		
	}
	
	public static void static_a() 
	{
		System.out.println("calling static variable in a static method :"+a);
		sample_static_nonstatic a2=new sample_static_nonstatic();
		System.out.println("calling non static variable in a static method :"+a2.b);
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("calling non static method");
		sample_static_nonstatic a2=new sample_static_nonstatic();
		a2.nonstatic();
		System.out.println("---------------------------------------------------");
		System.out.println("calling static method");
		static_a();
		
	}

}
