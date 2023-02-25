// here we are just creating a class without a main function 
// since we cant run a program without a main function we are calling this class in another class



public class Classes1 {
	public void class1(int floor) 
	{
		// int a=5; int b=6;
		// int sum= a+b;
		//	System.out.println("This is class 1 reinvoked in class 2" +" The value of sum is " + sum);

		System.out.println("you are on floor number"+ floor);
	}

}

/* if the method that we are calling has an parameter or an argument, we have to create a separate value for that parameter in the invoking class
 so we have to create another paramterr in that new class and pass that value in the method that we are calling from the class 1  */