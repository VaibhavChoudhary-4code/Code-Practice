package com.example.codePractice;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;

public class interview3 {

	public static void main(String[] args) {
		
		// isomorphic string or not 
		String s1 = "aaabbbbccd";
        String s2 = "nnnmmmmjjs";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        if (s1.length() != s2.length()) {
            System.out.println("It's not isomorphic.");
        } else {
            if (areIsomorphic(arr1, arr2)) {
                System.out.println("Strings are isomorphic.");
            } else {
                System.out.println("It's not isomorphic.");
            }
        }
		
		
		// Pair of sum existed in Integer array
		// [1,45,67,98,11]
		// 109 
		
		Integer[] arr3 = {1, 45, 67, 98, 11};
        int sum = 134;

        Set<Integer> object = new HashSet<>();
        for (int i = 0; i < arr3.length; i++) {
            object.add(arr3[i]);
        }

        boolean pairFound = false;
        for (int i = 0; i < arr3.length; i++) {
            int number = sum - arr3[i];
            if (number != arr3[i] && object.contains(number)) {
                System.out.println("Sum Existed");
                pairFound = true;
                break;
            }
        }

        if (!pairFound) {
            System.out.println("No pair found with the given sum.");
        }
		
		
		// Reverse of Linkedlist
        
		
	}

	private static boolean areIsomorphic(char[] arr1, char[] arr2) {
		HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            char char1 = arr1[i];
            char char2 = arr2[i];

            // If either map already contains a mapping for char1 or char2,
            // check if the mappings match
            if (map1.containsKey(char1)) {
                if (map1.get(char1) != char2) {
                    return false;
                }
            } else {
                map1.put(char1, char2);
            }

            if (map2.containsKey(char2)) {
                if (map2.get(char2) != char1) {
                    return false;
                }
            } else {
                map2.put(char2, char1);
            }
        }

        return true;
	}

}
