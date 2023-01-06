package ayoconnect_training;

public class sample_overriding1 extends sample_overriding
{
	public void car()           
	{
		System.out.println("Car: Kia seltos");
	}

	
	public void money()   
	{
		System.out.println("money: 15L");
	}
	
	public static void main(String[] args) 
	{
		sample_overriding1 s=new sample_overriding1();
		s.car();
		s.money();
		
	}


}
