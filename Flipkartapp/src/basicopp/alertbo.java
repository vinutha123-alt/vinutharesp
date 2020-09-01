package basicopp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class alertbo implements constantvalue
{
	public static WebDriver driver;
	@BeforeTest
	public static void loginapp() throws EncryptedDocumentException, IOException
	{
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.get(url2);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


}
	@AfterTest

	public static void logoutapp() 
	 
	 {
		 driver.quit();
	 }

}
