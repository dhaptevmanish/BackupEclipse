package TestPrograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Manish
 *
 */
public class FindDuplicateElements {
	
	
	public static void main(String args[]){    
        LinkedHashSet<String> lh=new LinkedHashSet(); // Implementing HashSet     
        
        // using linked hashset because it allows us to maintain the insertion order of the elements and allows us to avoid duplicates
               lh.add("A");    // Adding elements  
               lh.add("B");      
               lh.add("C");     
               lh.add("D");    
               lh.add("E"); 
               lh.add("E");   
               lh.add("B");   
               lh.add("A");   
               Iterator<String> i=lh.iterator(); // Traversing objects    
               while(i.hasNext()) // Return true if the Scanner has another token input    
               {    
               System.out.println(i.next());// printing elements     
               }    
 }    

}
