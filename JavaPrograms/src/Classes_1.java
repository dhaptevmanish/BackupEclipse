// encapsulation
public class Classes_1 {
	
	private int floor;
	
	
	public void setfloor(int floorno) {
		floor = floorno;
		
	}
	
	public int getfloor(){
	
		return floor;
	}
	
	public void showmessage() {
		System.out.println("You are in floor" + getfloor());
	}

}
