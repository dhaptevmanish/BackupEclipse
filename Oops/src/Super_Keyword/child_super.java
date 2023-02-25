package Super_Keyword;

public class child_super extends parent_super {
	
	

		
		public void superr() {
			super.superr();
			System.out.println("Child class");
		}
		
	
		public static void main (String[] args) {
			
			child_super o1 = new child_super();
			o1.superr();
			
			
		}

}
