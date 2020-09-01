package basicopp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import POM.login;


public class loginbo implements constantvalue 
{

	public static WebDriver driver;
	@BeforeTest
	public static void loginapp() throws EncryptedDocumentException, IOException
	{
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 String un=excel.exceldata("Login", 1, 0);
		 String pwd=excel.exceldata("Login", 1, 1);
		 
		 login l=new login(driver);
		 l.Username();
		 l.password();
		 l.loginBu();

		 
		 


	}
	 @AfterTest

	public static void logoutapp() 
	 
	 {
		 driver.quit();
	 }
}
