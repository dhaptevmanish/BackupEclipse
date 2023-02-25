package Inheritance;

public class Single_child extends Single_Parent {

	public void SBI() {
		System.out.println("SBI");
	}
	public static void main(String[] args) {

		Single_child child = new Single_child();
		child.Axis();
		child.SBI();
	}
}
