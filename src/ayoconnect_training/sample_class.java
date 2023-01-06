package ayoconnect_training;

public class sample_class 
{
	public static void main(String[] args) 
	{
		method1();
		
		sample_class a=new sample_class();
		a.method2();
	}

	
	public static void method1() 
	{
		System.out.println("printing static method1");
		
	}
	
	public void method2()
	{
		System.out.println("printing non static method2");
		
	}
}
