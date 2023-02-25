package This;

public class thistest {
	// Invoke The Constructor With ‘this'
		
		
		public thistest() {
		this("Vijay");
			System.out.println("Automation Test Engineer");
		}

		public thistest(String str) {
			this(90);

			System.out.println(str + "Is good boy");

		}
		
		public thistest(int no) {
			System.out.println("Manish got"+no+"marks");

		}
		
		
		public static void main(String[] args) {
			
			thistest test = new thistest();
			
		}
		
	}



