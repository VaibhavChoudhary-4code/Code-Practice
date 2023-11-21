package com.example.demo;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaNormalCodePractice12 {

	public static void main(String[] args) {
		
		// Could you provide a Java program that finds and returns the first non-repeated character in a given string? 
		// What approach would you use to efficiently solve this problem? (code)
		
		String s = "Vaibhav";
		
//		char firstNonRepetedChar = s.toLowerCase().chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting())).entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();
//		System.out.println(" First non-repeated character "+firstNonRepetedChar);
		
		// Write a program about first non repeated characters in string? (code)
		HashMap<Character,Integer> objMap = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			if(objMap.containsKey(s.charAt(i))) {
				objMap.put(s.charAt(i), objMap.get(s.charAt(i))+1);
			} else {
				objMap.put(s.charAt(i), 1);	
			}
		}
		
		objMap.entrySet().forEach((entry) -> {
			if(entry.getValue() == 1) {
				System.out.println(" First Non Repeted Character is "+entry.getKey());
			}
		});
		
		// How to run two threads parallel? (code)
		
//		Thread thread = new Thread(() -> {
//			
//		});
		
		
		// Write one code for getting the missing element from sorted array?
		
		
		
		
		
	}

	// https://leetcode.com/problems/left-and-right-sum-differences/description/

	public int[] leftRightDifference(int[] nums) {

	    int n = nums.length;
	    int[] leftSum = new int[n];
	    int[] rightSum = new int[n];

	    //Finding left sum
	    for(int i=1;i<n;i++){
	       leftSum[i]=leftSum[i-1]+nums[i-1];
	    }

	    //Finding right sum
	    for(int i=n-2;i>=0;i--){
	       rightSum[i]=rightSum[i+1]+nums[i+1];
	    }

	    int ans[]=new int[n];

	    //Taking abs diff values

	    for(int i=0;i<n;i++){
	         ans[i]=Math.abs(leftSum[i]-rightSum[i]);
	    }
	 return ans;  
	}
	
	// https://leetcode.com/problems/valid-parentheses/description/

	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();
		
		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[')
				stack.push(ch);
			else {
				if (ch == ')') {
					if (stack.isEmpty() || stack.pop() != '(')
						return false;
				}
				if (ch == '}') {
					if (stack.isEmpty() || stack.pop() != '{')
						return false;
				}
				if (ch == ']') {
					if (stack.isEmpty() || stack.pop() != '[')
						return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	// https://leetcode.com/problems/trapping-rain-water/description/
	
	public int trap(int[] height) {

		int i = 0;
		int j = height.length - 1;
		int leftmax = 0;
		int rightmax = 0;
		int water = 0;

		while (i < j) {
			if (height[i] <= height[j]) {
				leftmax = Math.max(leftmax, height[i]);
				water += leftmax - height[i];
				i++;
			}
			else {
				rightmax = Math.max(rightmax, height[j]);
				water += rightmax - height[j];
				j--;
			}
		}

		return water;
	}
	
	
	// https://leetcode.com/discuss/interview-question/1865052/crowdstrike-oa-slot-machines

//	public class Mani {
//	    public static void main(String[] args) {
//	    	//List<String> list = Arrays.asList("712","246","365","312");   127   246  365  123  
//	        List<String> list = Arrays.asList("137", "115", "364", "724"); // 127, 246, 356, 123
//	        List<String> sortedList = new ArrayList<>();
//	        for (String s : list) {
//	            StringBuilder str = new StringBuilder();
//	            String[] ar = s.split("");
//	            Arrays.sort(ar);
//	            for (String c : ar) {
//	                str.append(c);
//	            }
//	            sortedList.add(str.toString());
//	        }
//	        System.out.println(sortedList);
//	        int maxt = Integer.MIN_VALUE;
//	        int max = 0;//final ans
//	        for (int j = 0; j < 3; j++) {
//	            maxt = Integer.MIN_VALUE;
//	            for (int i = 0; i < sortedList.size(); i++) {
//	                String str = sortedList.get(i);
//	                String[] arr = str.split("");
//	               // System.out.println(Arrays.toString(arr));
//	                if (maxt < Integer.parseInt(arr[arr.length - 1])) {
//	                    maxt = Integer.parseInt(arr[arr.length - 1]);
//	                }
//	                //System.out.println(sortedList);
//	                sortedList.set(i, str.substring(0, arr.length - 1)); 
//	            }
//	            max = max + maxt; 
//	        }
//	        System.out.println(max);
//	    }
//	}
	
	
	// https://www.geeksforgeeks.org/subsequences-of-given-string-consisting-of-non-repeating-characters/
	
//	import java.util.*;
//
//	class GFG {
//
//		// Function to find all the subsequences of
//		// the string with non-repeating characters
//		public static void FindSub(HashSet<String> sub,
//								HashSet<Character> ch,
//								String str, String res,
//								int i)
//		{
//
//			// Base case
//			if (i == str.length()) {
//
//				// Insert current subsequence
//				sub.add(res);
//				return;
//			}
//
//			// If str[i] is not present
//			// in the current subsequence
//			if (!ch.contains(str.charAt(i))) {
//
//				// Insert str[i] into the set
//				ch.add(str.charAt(i));
//
//				// Insert str[i] into the
//				// current subsequence
//				FindSub(sub, ch, str, res + str.charAt(i),
//						i + 1);
//
//				// Remove str[i] from the set
//				ch.remove(str.charAt(i));
//			}
//			// Not including str[i] from
//			// the current subsequence
//			FindSub(sub, ch, str, res, i + 1);
//		}
//
//		// Utility function to print all subsequences
//		// of string with non-repeating characters
//		public static void printSubwithUniqueChar(String str,
//												int N)
//		{
//
//			// Stores all possible subsequences
//			// with non-repeating characters
//			HashSet<String> sub = new HashSet<>();
//
//			// Stores subsequence with
//			// non-repeating characters
//			HashSet<Character> ch = new HashSet<>();
//
//			FindSub(sub, ch, str, "", 0);
//
//			// Traverse all possible subsequences
//			// containing non-repeating characters
//			for (String subString : sub) {
//
//				// Print subsequence
//				System.out.print(subString + " ");
//			}
//		}
//
//		// Driver Code
//		public static void main(String args[])
//		{
//
//			String str = "abac";
//
//			int N = str.length();
//
//			printSubwithUniqueChar(str, N);
//		}
//	}

	
	
	// Question:There is infinite array of integers numbered consecutively from 0. At each step, a pointer can move from index I to index i+j or remain where it is.
	
//	public class Main {
//	    public static int max_reachable_index(int N, int B) {
//	        int max_index = 0;
//	        for (int i = 0; i < N; i++) {
//	            if (i != B) {
//	                max_index += Math.pow(2, N-i-1);
//	            }
//	        }
//	        return max_index;
//	    }
//	 
//	    public static void main(String[] args) {
//	        int N = 3;
//	        int B = 2;
//	        System.out.println(max_reachable_index(N, B));
//	    }
//	}
	
}


