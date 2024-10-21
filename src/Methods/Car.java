package Methods;

public class Car {
	
	public  void newcar() {
		System.out.println("My New Car is Swift");
	}
	
	public String oldcar() {
		return "Eeco";
	}
	
	private boolean dreamcar() {
		System.out.println("Mustang");
		return true;
	}
	public static void main(String[] args) {
		
		Car Dream = new Car();
		Dream.newcar();
		String Old = Dream.oldcar();
		 System.out.println(Old);
		Dream.dreamcar();
		}

}
