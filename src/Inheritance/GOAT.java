package Inheritance;

 class GOAT {
		void  gilli() {
			System.out.println("Gilli Adicha");
		}
 }
		
	class bigil extends GOAT {
		void coach() {
			System.out.println("Sigapenney");
		}
	}
	
	class Leo extends bigil {
		void dass() {
			System.out.println("Badass");
		}
	}
	class Main {
	public static void main(String[] args) {
		Leo thalapathy = new Leo();
		
		thalapathy.gilli();
		thalapathy.coach();
		thalapathy.dass();

		}
	}
	
