package exercise04_TreeMap;

import java.util.TreeMap;

public class TreeMapPutCeilingEntry {

	public static void main(String[] args) {
		TreeMap<String,String> treeMap=new TreeMap<>();      
		  
		  
		treeMap.put("C1", "Red");
		treeMap.put("C2", "Green");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "White");
		treeMap.put("C5", "Blue");
		   
		  System.out.println("Tree Map 1: "+treeMap); //Tree Map 1: {C1=Red, C2=Green, C3=Black, C4=White, C5=Blue}
		   TreeMap<String,String> treeMap2 = new TreeMap<>();
		   treeMap2.put("A1", "Orange");
		   treeMap2.put("A2", "Pink");
		   System.out.println("Tree Map 2: "+treeMap2); // ree Map 2: {A1=Orange, A2=Pink}
		   treeMap.putAll(treeMap2);
		   System.out.println("After coping map2 to map1: "+treeMap); // After coping map2 to map1: 
		   // {A1=Orange, A2=Pink, C1=Red, C2=Green, C3=Black, C4=White, C5=Blue}
		   
		   // 1) ceilingEntry(key); key map’te varsa entry’yi dondurur, key map’de yoksa 
		   //olmasi gereken yerden sonraki ilk entry’yi dondurur . En 
		   // buyuk keyden daha buyuk deger girilirse null doner
		   System.out.println(treeMap.ceilingEntry("A0")); // A1=Orange
		   System.out.println(treeMap.ceilingEntry("A3")); // C1=Red
	}

}
