// Ian Rennie
// #20518956
// Input is the string sentence input
// Output is the vowels and their respective counts, as well as the total vowel count

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class VowelCounter {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true) {
        	// Initialize Variables
        	String inputSentence;
        	
        	// Output Statement
        	System.out.println("Enter a sentence:");
        	
        	// Collects input string
        	inputSentence = scan.nextLine();
        	
        	// Map for each vowel to map the number of vowels to each vowel
        	Map<Character, Integer> vowels = new HashMap<>();
        	vowels.put('a', 0);
        	vowels.put('e', 0);
            vowels.put('i', 0);
            vowels.put('o', 0);
            vowels.put('u', 0);
            
            // Initialize total vowel count
            int totalVowels = 0;

        	//Loops through each character in the string input
        	for(int i = 0; i < inputSentence.length(); i++) {
        		// Checks to see if the character is a vowel
        		if(vowels.containsKey(inputSentence.charAt(i))) {
        			totalVowels++; // Adds to the total vowel count for each vowel
        			// Adds to respective vowel mapping
        			vowels.put(inputSentence.charAt(i), vowels.get(inputSentence.charAt(i)) + 1);
        		}
        	}
        	
        	//Print Statement
        	System.out.print("[");
        	// Loops through each vowel and prints their stats
        	for(char vowel : vowels.keySet()) {
        		System.out.print("('" + vowel + "', " + vowels.get(vowel) + ")");
        		if(vowel != 'o') System.out.print(", "); // Prints comma only when not ending the statement
        	}
        	System.out.println("]");
        	
        	//Final total vowel count
        	System.out.println("There are " + totalVowels + " vowels in this sentence");
        	
        }
	}

}
