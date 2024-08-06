package com.aurionpro.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		map.put("d", 40);
		map.putIfAbsent("a", 200);
		System.out.println(map);
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("a", 10);
		map2.put("b", 20);
		map2.put(null, null);
		map2.put("d", null);
		System.out.println(map2);
		
		LinkedHashMap<String, Integer> map3= new LinkedHashMap<>();
		map3.put("b", 20);
		map3.put("a", 10);
		map3.put("d", 50);
		map3.put("c", 30);
		System.out.println(map3);
		TreeMap<String, Integer> map4 = new TreeMap<>();
		map4.put("b", 20);
		map4.put("a", 60);
		map4.put("d", 50);
		map4.put("c", 30);
		System.out.println(map4);
		
		Set<Entry<String, Integer>> entries = map.entrySet();
		for(Entry<String,Integer> entry : entries) {
			System.out.println(entry.getKey() +" - " + entry.getValue());
		}
		
		
		
		
	}
}
