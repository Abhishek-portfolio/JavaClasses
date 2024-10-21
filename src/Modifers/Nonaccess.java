package Modifers;

public class Nonaccess {
	
	static void mystaticmethod () {
		System.out.println("Calling Static Method");
	}
	
	public void mypublicmethod() {
		System.out.println("Calling Public Method");
	}
	
	
	public static void main(String[] args) {
		mystaticmethod();
		
		Nonaccess Object = new Nonaccess();
		
		Object.mypublicmethod();
	}

}
