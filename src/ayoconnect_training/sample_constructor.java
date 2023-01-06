package ayoconnect_training;

public class sample_constructor
{
	int c;
	int d;
	sample_constructor(int a, int b)
	{
		c = a;
		d = b;
	}
	
	sample_constructor() 
	{
		 c= 10;
		 d = 40;
	}
	public void add()
	{
		System.out.println(c+d);
		
	}
	
	public static void main(String[] args) 
	{
		sample_constructor  ab=new sample_constructor();
		ab.add();
		
		sample_constructor an=new sample_constructor(50, 40);
		
		an.add();
		
		
		
	}

}
