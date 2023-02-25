package This;

public class ReturnThis {
	
	 int val_a;
	   int val_b;
	 
	    //Default constructor
	   ReturnThis()
	    {
	        val_a = 10;
	        val_b = 20;
	    }
	 
	   ReturnThis get()
	    {
	        return this;
	    }
	 
	   void display()
	    {
	         System.out.println("val_a = " + val_a + "  val_b = " + val_b);
	    }
	   
	   
	   public static void main(String[] args)
	    {
	    	ReturnThis object = new ReturnThis();
	        object.get().display(); // here we are calling the object and method name all at once.
	    }	

}
	
