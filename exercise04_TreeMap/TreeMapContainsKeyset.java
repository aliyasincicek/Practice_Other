package exercise04_TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapContainsKeyset {

	public static void main(String[] args) {
		
		TreeMap<String,String> treeMap=new TreeMap<>(); 
		  
		  
		treeMap.put("C1", "Red");
		treeMap.put("C2", "Green");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "White");
		treeMap.put("C5", "Blue");
		System.out.println(treeMap.containsKey("C4"));// TRUE
		System.out.println(treeMap.containsValue("Red")); // true
		
		Set<String> kume=treeMap.keySet(); // key'leri getiriyor
		System.out.println(kume); // [C1, C2, C3, C4, C5]
		for (String keykey : kume) {
			System.out.print(keykey); // C1C2C3C4C5
		}
		// 2) descendingKeySet(); key’leri descending order’la dondurur
     System.out.println(treeMap.descendingKeySet()); // [C5, C4, C3, C2, C1]
     // 4) floorEntry(key); girdigimiz key map’te yoksa, key’i girdigimiz 
     // sayidan kucuk olan en yakin Entry’yi dondurur
     System.out.println(treeMap.floorEntry("C6")); // C5=Blue
     // 5) headMap(key); girdigimiz key exclusive olmak uzere onceki 
     // Entry’leri bir map olarak verir 
     System.out.println(treeMap.headMap("C4")); // {C1=Red, C2=Green, C3=Black}
	}

}
