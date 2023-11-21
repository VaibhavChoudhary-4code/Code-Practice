package com.example.demo1;

import java.lang.ref.SoftReference;
import java.util.*;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;

public class JavaCodePractice1 implements InterfaceChild{

	void getData() {
		System.out.println(" From Child Class ");
	}
	
	public static void main(String[] args) {
	
		InterfaceParent.getData();
		InterfaceChild.getData();
		
		JavaCodePractice1 j1 = new JavaCodePractice1();
		j1.getData();
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Vaibhav");
		map.put(1, "Vaibhav");
		map.put(2, "Raghav");
		map.put(3, "Raghav");
		map.put(3, "Rohan");
		map.put(null, "Rohan");
		map.put(null, null);
		map.put(4, null);
		map.put(5, null);
		map.put(5, "11");
		
//		System.out.println(" Map "+map);
		
		// Using EntrySet (Java8)
//		map.entrySet().forEach((entry) -> System.out.println(entry.getKey()+" - "+entry.getValue()));
		
		
		// Using KeySet
//		for (Integer key : map.keySet()) {
//			System.out.println(key+" - "+map.get(key));
//		}
		
		// Using Iterator
//		Set<Integer> keySet = map.keySet();
//		Iterator<Integer> iterator = keySet.iterator();
//		while (iterator.hasNext()) {
//			Integer key = (Integer) iterator.next();
//			
//			System.out.println(key+" - "+map.get(key));
//		}
		
		
		// Using EntrySet For Loop
//	 	Set<Map.Entry<Integer, String>> obj = map.entrySet();
//		for (Entry<Integer, String> entry2 : obj) {
//			System.out.println(entry2.getKey()+" - "+entry2.getValue());
//		}
		
		// Using EntrySet & Iterator 
//		Set<Map.Entry<Integer, String>> obj = map.entrySet();
//		Iterator<Entry<Integer,String>> entrySetIterator = obj.iterator();
//		
//		while (entrySetIterator.hasNext()) {
//			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) entrySetIterator
//					.next();
//			
//			System.out.println(entry.getKey()+" - "+entry.getValue());
//			
//		}
		
		
		
//		HashSet<String> map1 = new HashSet<>();
//		map1.add("Vaibhav");
//		map1.add("Vaibhav");
//		map1.add("Vaibhav");
//		map1.add("Vaibhav");
//		map1.add("Vaibhav");
//		map1.add("Vaibhav1");
//		
//		System.out.println(" Set "+map1);
		
		
		
	}
}
