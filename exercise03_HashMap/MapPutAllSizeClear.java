package exercise03_HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapPutAllSizeClear {

	public static void main(String[] args) {
		// 7) putAll(map); verilen map’deki tum elemanlari bizim map’imize ekler, tekrarlanan eleman varsa uzerine yazar 
		// map interface'dir.Hashmap, Linkedhashmap ve HashTable classlarý map'i implement etmiþtir.
		// SortedMap interfacedir Map'i extends etmiþtir. TreeMap classý da SortedMap'i implement etmiþtir.
		
		HashMap <Integer, String> map = new HashMap<>();
		 map.put(1, "black");
		 map.put(2, "white");
		 map.put(3, "yellow");
		 map.put(4, "green");
		 map.put(5, "red");
		 
		 Map <Integer, String> map2=new HashMap<>();
		 map2.putAll(map);
		 System.out.println(map2.get(1)); // black
		 
		 System.out.println("Size of the map: "+map.size()); //5
		 
		 map2.clear();
		 System.out.println(map2); // {}

}
}