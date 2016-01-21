package file.io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEncryptor {

	public static File openSecretFile() throws IOException {
	
		File file = new File("Files/fileOne");
		
		return file;
	}

	public static Object readOneLine(File file) throws IOException  {
		
		File f = new File("Files/fileOne");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader reader = new BufferedReader(fr);
		
		String line = reader.readLine(); 
		
		return line;
	}

	public static Object readFileContents(File file) throws IOException {
		
		File f = new File("Files/fileOne");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader reader = new BufferedReader(fr);
		
		String content = reader.readLine();
		
		return content;
	}

	public static Object encrypt(String encryptMe) {
	
		
		return null;
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
