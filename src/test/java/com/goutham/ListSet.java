package com.goutham;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSet {
	public static void main(String[] args) {		
		List <String> list = new ArrayList <String> ();
		list.add("India");
		list.add("China");
		list.add("America");
		list.add("Japan");
		list.add("India");
		list.add("Uk");
		
		System.out.println(list);
		
		Set <String> set= new HashSet <String>();
		set.add("Asia");
		set.add("Europe");
		set.addAll(list);
		
		System.out.println(set);
		
		for(String x:set) {
			System.out.println(x);

			
		}

		
	}
      
}

