package assignments;

public class Assignment2 {

	
	static void numbers()
	{
		for(int i=1; i<=500; i++)
		{
			if(i%5==0 && i%3==0)
			{
				System.out.println("computer"+i);
			}
			
				else if(i%3==0)
				{
					System.out.println("mouse"+i);
				}
					
				else if (i%5==0)
				{
				System.out.println("computer and mouse"+i);	
				}
				}
			}
		
	

	public static void main(String[] args)
	{
		numbers();
	}
	
		

	}


