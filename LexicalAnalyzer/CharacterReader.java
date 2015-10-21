package lexPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterReader {
	int i;
	char lexChar;
	private BufferedReader inputfromFile;

	public CharacterReader(String file) throws FileNotFoundException {

		inputfromFile = new BufferedReader(new FileReader(file));
	}

	public char readChars() throws IOException {

		String line = inputfromFile.readLine();

		// Test for end of file
		 if (line == null) {
		 return (Character) null;
		 }

		for (i = 0; i < line.length(); i++) {
			lexChar = line.charAt(i);
		}

		return lexChar;

	}

}


