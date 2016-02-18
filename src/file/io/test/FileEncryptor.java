package file.io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;

import javax.print.DocFlavor.CHAR_ARRAY;

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

		FileReader reader = new FileReader(file);

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
		
		String text = encryptMe; // sets encryptMe to text
		
		System.out.println(text);

		text.toLowerCase(); // makes the whole text lower case

		String encrypted = "";

		String newl = "";

		char[] l = text.toCharArray(); // puts the letters from the text into the char array

		//System.out.println("Whole array: " + l);

		for (char c : l) { // goes through the char array

			c = (char) (c + 5); // adds on to the char value

					//System.out.println("int+1: " + letter);

			newl = Character.toString(c); // converts the char into a string

					//System.out.println("Letter: " + newl);

			encrypted = encrypted + newl;

		}

		System.out.println("Encrypted: " + encrypted);

		return encrypted;
	}

	public static File saveFile(String string) throws IOException {
			
		File file = new File("Files/fileName");
		
		FileWriter writer = new FileWriter(file); 
		
		writer.write(string);
		
		writer.close();
		
		return file;
	}

	public static void saveStuffInAFile(String string, File file) throws IOException {
		
		FileWriter writer = new FileWriter(file); 
		
		writer.write(string);
		
		writer.close();
		
	}

	public static Object decrypt(String decryptMe) {

		String text = decryptMe; // sets decryptMe to text
		
		System.out.println(text);

		text.toLowerCase(); // makes the whole text lower case

		String decrypted = "";

		String newl = "";

		char[] l = text.toCharArray(); // puts the letters from the text into the char array

		//System.out.println("Whole array: " + l);

		for (char c : l) { // goes through the char array

			c = (char) (c - 5); // subtracts from the char value	

			newl = Character.toString(c); // converts the char into a string
			
			decrypted = decrypted + newl;

		}

		System.out.println("Decrypted: " + decrypted);

		return decrypted;
	
	}

	

}
