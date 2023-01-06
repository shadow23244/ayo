package ayoconnect_training;

public class sample_this_super extends class2
{
	int a=20;
	
	public void m1() 
	{
		int a=40;
		System.out.println("using global variable a :"+this.a+a);
		System.out.println("using a variable from super class :"+super.a);
	}
	
	public static void main(String[] args) 
	{
		sample_this_super a=new sample_this_super();
		a.m1();
	}

}
