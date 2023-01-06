package ayoconnect_training;

public class sample_objects
{
	public void method1()
	{
		String a= "hello";
		String a2= new String("Hello2");
		System.out.println("using string objects :"+a+" "+a2);
		System.out.println("using method1 for object creation");
	}
	
	public static void main(String[] args) 
	{
		sample_objects a=new sample_objects();
		a.method1();
	}

}
