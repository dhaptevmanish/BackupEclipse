package Abstraction;

public class Interface_demo3 implements Interface_demo1, Interface_demo2 {

	@Override
	public void Vijay() {
		System.out.println("Is richest");
		
	}

	@Override
	public void Victor() {
		System.out.println("IS more richer");
	}
	
	public void VictorVijay() {
		System.out.println("Victor vijay is more richer");
	}
	
	
public static void main (String [] args) {
	Interface_demo3 obj = new Interface_demo3();
	
	obj.Vijay();
	obj.Victor();
	obj.VictorVijay();
}
}
