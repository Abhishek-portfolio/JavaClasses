package polymorphism;

class Cricketmatch {
	
	void match() {
		System.out.println("India win the T20 World Cup");
	}
}

class onedaymatch extends Cricketmatch {
	
	void match() {
		System.out.println("India win the One Day International World Cup");
	}
}

class testmatch extends onedaymatch {
	void match() {
		System.out.println("India win the Test World Cup");
	}
}
public class Cricket {

	public static void main(String[] args) {
		Cricketmatch menst20 = new Cricketmatch();
		onedaymatch  mens50 = new onedaymatch();
		testmatch menstest = new testmatch();
		
		menst20.match();
		mens50.match();
		menstest.match();
	}

}
