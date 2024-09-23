package assignments;

public class Globalvariable {

	static int a=50;
	static void add()
	
	{
	//a=60; //updating the value
	
	int sum=a+10;
	
	System.out.println(a);
}
	
	void substract()
	{
		int sub=500-a;
		
		System.out.println(sub);																																																																																																																																																																																																																																																																																																																																																																																														
	}
	
	public static void main(String[] args) {
	add();	
	Globalvariable g=new Globalvariable();
	g.substract();
	}

	
}
