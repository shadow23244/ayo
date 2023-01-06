package ayoconnect_training;

public class class3 extends class2
{
	public void house() 
	{
		System.out.println("calling house from class3");
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("performing multilevel inheritance");
		class3 a=new class3();
		a.car();
		a.bike();
		a.house();
		
	}

}
