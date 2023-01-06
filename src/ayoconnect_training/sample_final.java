package ayoconnect_training;

final public class sample_final 
{
	final static int a = 20;
	
	final public void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		sample_final s=new sample_final();
		System.out.println("declaring class, variable , method as final");
		s.m1();
	}

}
