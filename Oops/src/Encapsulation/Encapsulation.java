package Encapsulation;

public class Encapsulation {
	
	private int a;
	private String s;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;    
	}
	
public static void main (String args[]) {
	Encapsulation e = new Encapsulation();
	e.setA(20);
	e.setS("manish");
	
	System.out.println(e.getA());
	
	System.out.println(e.getS());
}
}
