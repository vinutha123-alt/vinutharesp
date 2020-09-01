package testscripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POM.home;
import basicopp.excel;
import basicopp.loginbo;


public class searchmobile extends loginbo
{
@Test
public static void searchmob() throws EncryptedDocumentException, IOException, InterruptedException

{
home h= new home(driver);

String value=excel.exceldata("Home", 1, 0);
h.search1(value);
h.searchicon();
h.resulticon();

Set<String> Windid = driver.getWindowHandles();
for(String wh:Windid)
{
	driver.switchTo().window(wh);
}

h.carticon();
Thread.sleep(5000);



}
}