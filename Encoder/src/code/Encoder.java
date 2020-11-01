package code;

import java.util.HashMap;

public class Encoder {
	public static String encodeText(String text) {
		HashMap<Character, Character> cipher = CipherCreator.createCipher();
		
		StringBuilder changingText = new StringBuilder(text);
		
		for(int i = 0; i < changingText.length(); i++) {
			if(String.valueOf(changingText.charAt(i)).matches("[а-яА-Я]")) {
				changingText.setCharAt(i, cipher.get(changingText.toString().toUpperCase().charAt(i)));
			}
		}
		
		text = changingText.toString().toUpperCase();
		
		return text;
	}
}
