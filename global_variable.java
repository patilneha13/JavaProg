package assignments;

public class global_variable {

	int age;
	String Name;
	double Salary;
    void add(int age, String Name, double Salary)
    {
    	System.out.println(age); //Local variables we can see in brown colour 
    	System.out.println(Name);
    	System.out.println(Salary);
    	
    }
    		

	public static void main(String[] args) 
	{
		global_variable g1 = new global_variable();
		g1.add(32,"Neha", 5000);
		
		System.out.println(g1.age);  //Global variable we can see in blue colour
		System.out.println(g1.Name);
		System.out.println(g1.Salary);
	
	}

}
