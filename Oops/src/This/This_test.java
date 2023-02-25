package This;

public class This_test {
	
		
		
		int x;
		int y;
		
		
		public This_test (int x, int y) {
			
		this.x=x;
		this.y=y;
		}

		public void calc() {
			
			int sum = x + y ;
			
			System.out.println(sum);
		}
		
		public static void main(String[] args) 
		{
			This_test test = new This_test(39,89);
			test.calc();
		}
	}
