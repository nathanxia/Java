package JavaSetsAlgorithm;

import java.util.*;

/*
 * Count consonants and vowels
 * Write a program that prompts the user to enter a text
 * file name and display the number of vowels and consonants in the file
 * Use a set to store the vowels A, E, I, O, and U.
 */

public class CountConsonantsAndVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] file = new String[] {"apple", "banana", "orange","apple", "watermelon", 
				"banana", "orange","apple", "pear", "banana", "orange", "strawberry"};
		
		Set<Character> set = new HashSet<>(Arrays.asList(new Character[] {'A', 'E', 'I', 'O', 'U'}));
		
		int vowelCount = 0;
		int consonantCount  = 0;
		
		for (String val : file) {
			
			for (Character c : val.toCharArray()) {
				if (set.contains(Character.toUpperCase(c))) {
					vowelCount++;
					continue;
				}
				if (Character.isLetter(c)) {
					consonantCount++;
					continue;
				}
			}
		}
		System.out.println("vowelCount: " + vowelCount + "; consonantCount: " + consonantCount); 
	}

}
