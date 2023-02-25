package String;

public class Splitstring {
	
	
public static void main(String[] args) {

		
		//real text
		String s = "manish=is=bad=boy";
		String[] g =s.split("="); 
// here we are using s.split and the we are passing the character from which the split has to be done. 
//the char will be used as a refrence to split the string.	
		
		
		for(int i=0; i<g.length;i++) {
			System.out.println(g[i]);
		}
	}

}

