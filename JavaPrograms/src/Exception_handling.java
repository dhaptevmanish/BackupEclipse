
public class Exception_handling {

	public static void main(String[] args) {
		int a[] = { 12, 23, 23, 56, 78 };// int array

		String d[] = { "a", "b", "c" };

	//	System.out.println(d[6]); // this will throw out of bound exception so we r using excption handling
		
		try{
		System.out.println(d[5]); // handling this using try catch
		}
		catch(Exception e) {
			
			System.out.println("exception handled");
		}
	
		System.out.println("system is still running");
	
	}

}
