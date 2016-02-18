package file.io.test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class tests {

	@Test
	/* Create a file in your project. Use the File object to open it. */
	public void testOpenFile() throws Exception {
		
		assertTrue(FileEncryptor.openSecretFile().isFile());
		
	}

	@Test 
	/* Adjust these asserts to match the text in your secret file. */
	public void testReadFile() throws Exception {
		
		File file = FileEncryptor.openSecretFile();
		
		assertEquals("Hello world", FileEncryptor.readOneLine(file));
		
		assertEquals("Hello worldrandom stuff", FileEncryptor.readFileContents(file));
	}

	@Test 
	/* Create your own encryption algorithm and adjust the asserts. */
	public void testEncrypt() throws Exception {
		
		String encryptMe = "ababa";
		
		assertEquals("fgfgf", FileEncryptor.encrypt(encryptMe));
	}

	@Test 
	public void testSaveAFile() throws Exception {
		
		assertTrue(FileEncryptor.saveFile("fileName").isFile());
		
	}
	
	@Test 
	public void testSaveStuffInFile() throws Exception {
		
		File file = new File("Files/file with stuff");
		
		FileEncryptor.saveStuffInAFile("stuff", file);
		
		assertEquals("stuff", FileEncryptor.readFileContents(file));
		
	}

	@Test 
	public void testDecrypt() throws Exception {
		
		String decryptMe = "fgfgf";
		
		assertEquals("ababa", FileEncryptor.decrypt(decryptMe));
	}

	@Test 
	public void testEverythingTogether() throws Exception {
		
		String secretfileName = "june's secrets";
		
		File secretFile = new File("Files/" + secretfileName);
		
		String stuffToEncrypt = (String) FileEncryptor.readFileContents(secretFile);
		
		String encryptedStuff = "" + FileEncryptor.encrypt(stuffToEncrypt);
		
		FileEncryptor.saveStuffInAFile(encryptedStuff, secretFile);

		String stuff = (String) FileEncryptor.readFileContents(secretFile); 
		
		assertEquals(stuffToEncrypt, FileEncryptor.decrypt(stuff));

		
	}
}
