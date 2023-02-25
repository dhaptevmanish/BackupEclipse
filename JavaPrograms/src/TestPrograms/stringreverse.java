package TestPrograms;

public class stringreverse {
	
	public static void main(String args[]) {

//	  using string buffer
    {
	    String s = "hello" ;
		StringBuffer a = new StringBuffer(s);
	     
		
		
		System.out.println(a.reverse());
	  }
    
	
	

    
//	
	
// using char at	
	String s1 = "neelendra" ;
    for(int i=s1.length()-1;i>=0;i--)
        {
            
    	System.out.print(s1.charAt(1));
        }
	
  //  using for loop
   
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Input a string: ");
//    char[] letters = scanner.nextLine().toCharArray();
//    System.out.print("Reverse string: ");
//    for (int i = letters.length - 1; i >= 0; i--) {
//        System.out.print(letters[i]);
//    }
//    System.out.print("\n");  
    
    
}}
