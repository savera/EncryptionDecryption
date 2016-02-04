package file.io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;

public class FileEncryptor {

	public static File openSecretFile() throws IOException {

		// creates a file
		File file = new File("Files/fileOne");

		return file;
	}

	public static Object readOneLine(File file) throws IOException {

		File f = new File("Files/fileOne");

		// reads all the file
		FileReader fr = new FileReader(f);

		// reads one line of the file
		BufferedReader reader = new BufferedReader(fr);

		String line = reader.readLine();

		return line;
	}

	public static Object readFileContents(File file) throws IOException {

		File file2 = new File("Files/fileOne");

		FileReader reader = new FileReader(file2);

		BufferedReader read = new BufferedReader(reader);

		String lines;

		String line = "";

		// while there are no more lines

		while ((lines = read.readLine()) != null) {

			line = line + lines;
		}

		return line;
	}

	public static Object encrypt(String encryptMe) throws IOException {

		File file = new File("Files/fileTwo"); // creates a file

		FileReader reader = new FileReader(file); // reads the entire file

		FileWriter writer = new FileWriter(file); //writes in the file

		BufferedReader read = new BufferedReader(reader); // reads the file
		
		String fileContents = ""; // gets all the files contents and converts them to a String
	
		//use a char 
		
		//System.out.println(fileContents);

		for (int i = 0; i < fileContents.length(); i++) {

			String letter = fileContents.substring(i); // gets one letter

			if (letter.equals("a")) { // if the letters is a

				// writes the letter b
			//	writer.write("b", i, fileContents.length()); 
				
				System.out.println("a");

			} else if (letter.equals("b")) { // if the letter is b

				//writes the letter c
			//	writer.write("c", i, fileContents.length()); 
				
				System.out.println("b");

			}

		}

		String line = read.readLine(); // reads the line

		System.out.println(line);

		return line;
	}

	public static File saveFile(String string) {

		return null;
	}

	public static void saveStuffInAFile(String string, File file) {

	}

	public static Object decrypt(String decryptMe) {

		return null;
	}

	public static Object decrypt(Object readFileContents) {

		return null;
	}

}
