package arraylist;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	
	public static void main (String[] args) {
		
		HashMap <String, Integer> map = new HashMap<> ();
		
		print(map);
		map.put("abc", 10);
		map.put("mno", 20);
		map.put("xyz", 30);
		
		System.out.println("Size of map is" +map.size());
		
		
		print(map);
		
		if(map.containsKey("abc")) {
			Integer a = map.get("abc");
			System.out.println("value for key is "+a);
			
		}
		map.clear();
		print(map);
		
	}
	
	public static void print (Map <String, Integer> map) {
		if (map.isEmpty()) {
			System.out.println("map is empty");
		}
		else 
			System.out.println(map); 
	}
	
	
}
