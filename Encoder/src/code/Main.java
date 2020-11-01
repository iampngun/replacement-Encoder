package code;

public class Main {
	public static void main(String[] args) {
		FileReaderWriter.writeFile("Out.txt", Encoder.encodeText(FileReaderWriter.readFile("Input.txt")));
	}
}
