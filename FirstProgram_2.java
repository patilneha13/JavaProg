package assignments;
//Call 2 static and 2 nonstatic methods inside main method

public class FirstProgram_2 {

	public static void main (String [] args) 
	{
		System.out.println("Fruit Names");
		Fruit();
		Fruit1();
	
		FirstProgram_2 f=new FirstProgram_2();
		f.Fruit2();
		f.Fruit3();
		
	}
	static void Fruit ()
	{
		System.out.println("Orange");
	}
	static void Fruit1 ()
	{
		System.out.println("Grapes");
	}

	void Fruit2()
	{
		System.out.println("Watermelon");
		
	}
	void Fruit3()
	{
		System.out.println("Papaya");
		
	}
}
