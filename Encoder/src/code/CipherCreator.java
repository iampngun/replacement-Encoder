package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CipherCreator {
	public static HashMap<Character, Character> createCipher() {
		HashMap<Character, Character> cipher = new HashMap<>();
		
		List<Character> values = new ArrayList<>();
		for(char i = 'А'; i <= 'Я'; i++) {
			values.add(i);
		}
		
		List<Character> keys = new ArrayList<>();
		String keysString = FileReaderWriter.readFile("Keys.txt");
		for(int i = 0; i < keysString.length(); i++) {
			keys.add(keysString.charAt(i));
		}
		
		for(int i = 0; i < values.size(); i++) {
			cipher.put(values.get(i), keys.get(i));
		}
		
		return cipher;
	}
}
