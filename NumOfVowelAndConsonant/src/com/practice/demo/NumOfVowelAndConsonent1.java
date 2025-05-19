package com.practice.demo;

public class NumOfVowelAndConsonent1 {

	public static void main(String[] args) {

		String str = "Ashok IT";
		findNumOfVowelAndConsonent(str);

	}

	private static void findNumOfVowelAndConsonent(String str) {

		char c[] = str.toCharArray();

		int vowelCount = 0, consoCount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E'
					|| c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
				vowelCount++;
			} else if(!Character.isDigit(c[i]) && c[i] != ' ' && c[i] != '@' && c[i] != '$' && c[i] != '#' && c[i] != '!'){
				consoCount++;
			}

		}

		System.out.println(consoCount + " Consonents");
		System.out.println(vowelCount + " Vowels");

	}

}
