package arraylist;

import java.util.ArrayList;

public class Arraylist {
	
	public static void main (String args[]) {
		
		ArrayList a = new ArrayList();
		Object CloneList;
		a.add("E1");
		a.add("E2");
		a.add("E3");
		
		
		System.out.println("The size of array is"+a.size());
		System.out.println(a);
		
		a.remove("E3"); 
		System.out.println("Size after deletion is"+ a.size());
		System.out.println(a);
		
		CloneList = a.clone();
		System.out.println("THe cloned list is"+CloneList);
		
		Object[] objarray = a.toArray();
		System.out.println("Elements in the array list are ");
		for (int i=0; i<a.size() ; i++) {
			System.out.println(objarray[i]);
		}
		
		
		
		
		
		
	}

}
