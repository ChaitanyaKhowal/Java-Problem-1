package com.practice.demo;

public class NumOfVowelAndConsonent2 {

	public static void main(String[] args) {

		String str = "Ashok IT";
		findNumOfVowelAndConsonent(str);

	}

	private static void findNumOfVowelAndConsonent(String str) {

		int vowelCount = 0, consoCount = 0;

		for (char c : str.toCharArray()) {

			if (Character.isLetter(c)) {

				char character = Character.toLowerCase(c);

				if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
					vowelCount++;
				} else {
					consoCount++;
				}

			}
		}

		System.out.println(consoCount + " Consonents");
		System.out.println(vowelCount + " Vowels");

	}

}
