package ArrayList;

import java.util.ArrayList;

public class Motors {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Benz");
		cars.add("BMW");
		cars.add("Mustang");
		cars.add("Range Rover");
		
		// cars.set(2, "Polo"); Replace the element by using .set 
		cars.remove (3); // remove the element by using .remove
		
		System.out.println(cars);
		System.out.println(cars.get(0));  //using get  method for refer index number
		System.out.println(cars.size());  // count the values given in cars by size
		
 	}

}
