package testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import POM.homealert;
import basicopp.alertbo;

public class alertpop extends alertbo
{

	@Test
	public static void fileupd() throws EncryptedDocumentException, IOException, InterruptedException

	{
	homealert al= new homealert(driver);

al.customerid();
al.buttonicon();
Thread.sleep(5000);
Alert alr=driver.switchTo().alert();
alr.accept();

}

}
