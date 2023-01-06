package ayoconnect_training;

public class sample_access_modifiers 
{
	private void method1() 
	{
		System.out.println("using private access modifier");
		
	}
	
	void method2()
	{
		System.out.println("using default access modifier");
	}
	
	protected void method3() 
	{
		System.out.println("using protected access modifier");
		
	}
	
	public void method4() 
	{
		System.out.println("using public access modifier");
		
	}
	
	public static void main(String[] args) 
	{
		sample_access_modifiers a=new sample_access_modifiers();
		a.method1();
		a.method2();
		a.method3();
		a.method4();
		
	}

}
