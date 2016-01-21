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
		
		assertEquals("Hello world ", FileEncryptor.readOneLine(file));
		
		assertEquals("Hello world random stuff", FileEncryptor.readFileContents(file));
	}

	/* Create your own encryption algorithm and adjust the asserts. */
	public void testEncrypt() throws Exception {
		String encryptMe = "lalala";
		assertEquals("ncncnc", FileEncryptor.encrypt(encryptMe));
	}

	public void testSaveAFile() throws Exception {
		assertTrue(FileEncryptor.saveFile("fileName").isFile());
	}

	public void testSaveStuffInFile() throws Exception {
		File file = new File("file with stuff");
		FileEncryptor.saveStuffInAFile("stuff", file);
		assertEquals("stuff", FileEncryptor.readFileContents(file));
	}

	public void testDecrypt() throws Exception {
		String decryptMe = "ncncnc";
		assertEquals("lalala", FileEncryptor.decrypt(decryptMe));
	}

	public void testEverythingTogether() throws Exception {
		String secretfileName = "june's secrets";
		File secretFile = new File(secretfileName);
		//String stuffToEncrypt = FileEncryptor.readFileContents(secretFile);
		//String encryptedStuff = FileEncryptor.encrypt(stuffToEncrypt);
		//FileEncryptor.saveStuffInAFile(encryptedStuff, secretFile);

		//assertEquals(stuffToEncrypt, FileEncryptor.decrypt(FileEncryptor.readFileContents(secretFile)));

		
	}
}
