package Linkedlist;

import java.util.LinkedList;

public class Bikes {

	public static void main(String[] args) {
			LinkedList<String> Bike = new LinkedList<String>();
			Bike.add("KTM-DUKE");
			Bike.add("BAJAJ-PULSAR");
			Bike.add("RE-CLASSIC 350");
			
			Bike.addLast("JAWA");
			Bike.addFirst("XL-100");
			Bike.removeLast(); // same wise to FIRST
			System.out.println(Bike);
			

	}

}
