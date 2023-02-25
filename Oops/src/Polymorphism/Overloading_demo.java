package Polymorphism;

public class Overloading_demo {
	
	public  void Add(int a)
	{
		System.out.println(a);
	} 
	
	public  void Add(String b)
	{
		System.out.println(b);
	} 
	
	public  void Add(double c)
	{
		System.out.println(c);
	} 
	
	
	public static void main (String[] args) {
		Overloading_demo o1 = new Overloading_demo();
		o1.Add(10);
		o1.Add("s");
		o1.Add(1.2);
		
	
		
	}

}
