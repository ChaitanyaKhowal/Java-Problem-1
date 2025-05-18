package com.practice.demo;

public class NumOfVowelAndConsonent {

	public static void main(String[] args) {

		String str = "Chaitanya";
		findNumOfVowelAndConsonent(str);

	}

	private static void findNumOfVowelAndConsonent(String str) {

		char c[] = str.toCharArray();
		boolean visited[] = new boolean[str.length()];

		for (int i = 0; i < str.length(); i++) {

			int vowel = 0, consonant = 0;
			
			char[] ogVowel = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

			for (int j = 0; j < ogVowel.length; j++) {

				if (c[i] == ogVowel[j]) {
					System.out.println(c[i] + " is the vowel");
					break;
				} else {
					System.out.println(c[i] + " is the consonant");
					break;
				}

			}

		}

	}
}
