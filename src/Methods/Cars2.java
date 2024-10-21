package Methods;

public class Cars2 {

	
	
	public static void main (String[]args) {
		Cars2 dream = new Cars2();
		dream.newcar("Mustang");
		dream.newcar(2024);
		dream.newcar("RangeRover");
		dream.newcar(2024);
		
	}

	// METHOD WITH PARAMETER
	
	private void newcar(String Toplevelcars) {
		System.out.println("Dream Car-"+ Toplevelcars);
	}
		//OVERLOADING 
		
		private void newcar(int ModelYear) {
			System.out.println("ModelYear-"+ ModelYear);	
	}
}
