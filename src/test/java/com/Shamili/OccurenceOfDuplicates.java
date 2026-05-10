package com.Shamili;

import java.util.HashMap;
public class OccurenceOfDuplicates {
	public static void main(String[] args) {
		
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        // Count each character
        for (char ch : str.toCharArray()) 
        {
            if (map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
            } 
            else
            {
                map.put(ch, 1);
            }
        }

        // Print only duplicates
        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " : " + map.get(ch));
            }
        }
    }
}


