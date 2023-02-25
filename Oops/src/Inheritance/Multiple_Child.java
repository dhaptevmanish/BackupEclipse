package Inheritance;

public class Multiple_Child extends Multiple_Parent {

	public void Yamaha() {
		System.out.println("R15");
	}
	
	
	public static void main(String[] args) {
		Multiple_Child child = new Multiple_Child();
		
		child.Honda();
		child.BUllet();
		child.Yamaha();
		
		
	}
	
}
