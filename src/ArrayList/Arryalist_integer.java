package ArrayList;

import java.util.ArrayList;

public class Arryalist_integer {

	public static void main(String[] args) {
		
		ArrayList<String> Vechile = new ArrayList<String>();
		ArrayList<Integer> Modelyear = new ArrayList<Integer>();
				
		Vechile.add("Polo");
		Modelyear.add(2024);
		Vechile.add("Swift");
		Modelyear.add(2023);
		Vechile.add("Nexon");
		Modelyear.add(2022);
		Vechile.add("Rapid");
		Modelyear.add(2021);
			
		for (int i : Modelyear)  {
			System.out.println(i);
		}
		for (String a : Vechile) {
			System.out.println(a);
		}
	}

}
