/* in this program we are calling the class1 that we created prevously both using an object 
 and without an object */


public class Classes2 {
	
	public static void main (String[] args) {
		Classes1 obj = new Classes1();
		int floorlvl =5; // just creating a value and passing it as a parameter into method name in class 1
		obj.class1(floorlvl); // we are just creating an object and recalling that in class 2 
		// class1(); // if the method that we are calling is a static method we can just mention the name of that method without creating an object for it.
		
		// passing the floor lvl value in the method name of the first class will go to the method name and will use the value passes in the parameter of that method
		
		
		
	}

}
