package This;

import javax.sound.sampled.Line;

// Invoke The Current Class Method With ‘this’
//Just as you can pass ‘this’ pointer to the method, you can also use this pointer to invoke a method. If at all you forget to include this pointer while invoking the method of the current class, 
//then the compiler adds it for you.

public class This_method {

	public void print() {
		this.show();

		// here putting this.show before the print method, it will print the show here
		// first and then it will go to the nxt Line
		// putting this will refer to the method and execute that method first and then
		// continues the execution.
		System.out.println("Print method");

	}

	public void show() {
		System.out.println("Show method");
	}

	public static void main(String[] args) {
		This_method th = new This_method();
		th.print();
	
	}

}
