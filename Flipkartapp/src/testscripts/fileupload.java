package testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POM.homeupload;
import basicopp.uploadbo;

public class fileupload extends uploadbo

{
	@Test
	public static void fileupd() throws EncryptedDocumentException, IOException, InterruptedException

	{
	homeupload m= new homeupload(driver);
m.uploadicon();
m.checkboxicon();
m.submit();
	}
}

