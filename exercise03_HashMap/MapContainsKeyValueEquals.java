package exercise03_HashMap;

import java.util.HashMap;

public class MapContainsKeyValueEquals {

	public static void main(String[] args) {
	//  1)containsKey(key); istenen key degeri Map’de varsa true, yoksa false doner .	
		HashMap <Integer, String> map = new HashMap<>();
		 map.put(1, "black");
		 map.put(2, "white");
		 map.put(3, "yellow");
		 map.put(4, "green");
		 map.put(5, "red");
		 
			 if (map.containsKey(4)) {
				 System.out.println("evet "+ map.get(4)); // evet green
				
			} else { System.out.println("hayir");

			}
			 //2) containsValue(value); istenen key degeri Map’de varsa true, yoksa false doner . 
			 
			 System.out.println(map.containsValue("red")); // true
			 
			// 4) equals(map); Map’deki tum elemanlari karsilastirir. Hepsi ayni ise true farkli olan varsa false dondurur
			 
			 HashMap <Integer, String> map2 = new HashMap<>();
			 map2.put(1, "patates");
			 map2.put(2, "tursu");
			 
			 
			 HashMap <Integer, String> map3 = new HashMap<>();
			 map3.put(1, "black");
			 map3.put(2, "white");
			 map3.put(3, "yellow");
			 map3.put(4, "red");
			 map3.put(5, "green");
			 
			 System.out.println(map.equals(map2)); //false
			 System.out.println(map.equals(map3)); // false
			 
				
	}

}
