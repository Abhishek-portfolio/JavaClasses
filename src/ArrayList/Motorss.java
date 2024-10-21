package ArrayList;

import java.util.ArrayList;

public class Motorss {

	public static void main(String[] args) {
		ArrayList<String> bikes = new ArrayList<String>();
		bikes.add("KTM-Duke");
		bikes.add("Royal Enfiled - Classic 350");
		bikes.add("Plusar-NS200");
		bikes.add("TVS-XL100");
		
		for (int i = 0; i< bikes.size(); i++) {
			System.out.println(bikes.get(i));
		}
		System.out.println(bikes);
		System.out.println(bikes.get(1));
		System.out.println(bikes.size());

	}

}
