package exercise03_HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapPutGetEntry {

	public static void main(String[] args) {
		
		/*
		 * 
		
 		
 		
		8) compute(key, (key,value)->yeniDeger); verilen map’deki istenen key degerine sahip elemanin value’sunu gunceller key map’te yoksa ekler 
		9) ComputeIfPresent(key, (key,value)->yeniDeger); istenen key degeri Map’de varsa o key’e ait value’yu gunceller, map’de yoksa birsey yapmaz 
		10) ComputeIfAbsent(key, k ->yeniDeger); istenen key degeri map’de yoksa o key’i ve value’yu ekler, map’de varsa birsey yapmaz 
		11) putIfAbsent(key, value); verilen key map’de yoksa ekler.

		 */
		 HashMap <Integer, String> map = new HashMap<>();
		 map.put(1, "black");
		 map.put(2, "white");
		 map.put(3, "yellow");
		 map.put(4, "green");
		 map.put(5, "red");
		 
		 // enterySet() metodunu kullanarak ile HashMap  nesnemizinde ki key and value deðerlerimizi görebiliyoruz.
		 // 3) entrySet(); Map’deki entry’leri bir Set olarak verir. Entry : Map’de her bir elemani olusturan key-value ikilisidir
			                                                   
		 
		 for (Entry<Integer, String> each : map.entrySet()) {  
			 System.out.println(each.getKey() + " "+ each.getValue());	
			 										
		}
		 //5) get(key); istenen key degeri Map’de varsa o key’e ait value’yu, map’de yoksa null doner. 
		//6) getOrDefault(key,defaultDeger); istenen key degeri Map’de varsa o key’e ait value’yu, key map’te yoksa default degeri doner.
		 
		System.out.println(map.getOrDefault(6, null));	// null
		 
	}

}
