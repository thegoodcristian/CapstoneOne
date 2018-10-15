package com.capstoneOne;

import java.util.Scanner;

public class PigLatin {

	//I prompt the user to enter a sentence in English.
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Pig Latin Translator! Please enter your sentence:");
		String userInputSentence = scnr.nextLine();

		//I populate wordArray with each English word one by one 
		//I then run my translateWord method for all necessary iterations (for as many words as there are in the sentence).
		
		System.out.println("Your sentence in Pig Latin is:");
		String[] wordArray = userInputSentence.split(" ");
		for (int i = 0; i < wordArray.length; i++) {

			translateWord(wordArray[i]);

		}

		scnr.close();

	}

	public static void translateWord(String wordPassed) {

		//I initialize a final variable denoting all vowels, as they are constants.
		
		final String allVowels = "AEIOUaeiou";
		
		//I initialize variables for lettersBeforeVowel and split to signal where the word must be split (and what letter values need to be stored for each word). 
		String lettersBeforeVowel = "";
		int split;

		
		//I run a loop that runs along the word, checking each letter to see if it is a vowel.
		//The word is split at the vowel and preceding characters are stored within lettersBeforeVowel
		for (split = 0; split < wordPassed.length() && !allVowels.contains("" + wordPassed.charAt(split)); split++) {
			lettersBeforeVowel += wordPassed.charAt(split);
		}
		if (split == 0) {
			wordPassed += "w";
		}

		//The Pig Latin words are printed by taking the letters following the split + lettersBeforeVowel + ay.
		wordPassed = ((wordPassed.substring(split)) + lettersBeforeVowel + "ay");
		System.out.print(wordPassed + " ");

	}

}
