
public class BreakandContinue {
	
	public static void main (String args[]) {
		
		for (int i=0; i<9; i++) {
			
			if (i==4) {
				break;
			}
		System.out.println("While using break"+i);
		
		}
		
for (int i=0; i<9; i++) {
			
			if (i==4) {
				continue; // continue will only skip that case and when the condition is true, and will continue the remaining cases
			}
		System.out.println("While using break"+i);
		
		}
		
		
	}

}
