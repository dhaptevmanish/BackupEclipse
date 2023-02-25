
// same method name is there and we want to run the subclass we can use override. The method where the override is there will be run by the compiler


class Overriding {

	void draw() {
		System.out.println("Can't say shape type");

	}

}

class circle extends Overriding {
	
	@Override 
	
	void draw() {
		System.out.println("Circle shape");
	}
	
	
}

class Demo {
	public static void main (String[] args) {
		Overriding obj = new circle();
		
	obj.draw();
	}
	}

