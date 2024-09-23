package assignments;
//Access static method inside main method
public class CallStaticMethod_2 {

	public static void main(String[] args)
	{
		
			System.out.println("Head of Patil Family : Dilip Patil");
			Mother();
			Daughter();
			Son();
			Grandchild();
		}
		
   static void Mother()
   {
	   System.out.println("Mother : Bharati Patil");
	   
	}
   static void Daughter()
   {
	   System.out.println("Daughter : Neha");
   }
   
   static void Son()
   {
	   System.out.println("Son : Aniket");
	   
   }
   static void Grandchild()
   {
	   System.out.println("Grandchild : Akshad");
   }

}
