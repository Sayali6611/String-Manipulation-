package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static boolean isAnagram(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First String: ");
		String str1 = sc.nextLine();
		
		System.out.println("Second String: ");
		String str2 = sc.nextLine();
		
		if(isAnagram(str1, str2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
