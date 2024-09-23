package assignments;
//Constructor overloading
public class Neha 
{
 Neha()
 {
	 System.out.println("2");
 }
 Neha(int a)
 {
	 System.out.println("3");
 }
 Neha(boolean a)
 {
	 System.out.println("I am a girl");
 }
 Neha(String a)
 
 {
	 System.out.println("My name is Neha");
 }
 Neha (char a)
 {
	 System.out.println(79.5);
 }
 public static void main (String[] args)
 {
	 System.out.println("These are my constructors");
	 new Neha();
	 new Neha(9);
	 new Neha(true);
	 new Neha("a");
	 new Neha('a');
	 
	 
 }
}
