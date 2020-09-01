package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeupload 
{
	//declaration
	@FindBy(xpath="//input[@id='uploadfile_0']")
	private WebElement upload;
	
	
	
	@FindBy(xpath="//input[@type='checkbox']")

	private WebElement checkbox;

	
	@FindBy(xpath="//button[@id='submitbutton']")

	private WebElement submitbutton;





//initialisation of elements

public homeupload(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//utilize



public void uploadicon()
{
	upload.sendKeys("C:\\Program Files\\Java\\Variable\\vinutha answers.txt");
}

public void checkboxicon()
{
	checkbox.click();
}

public void submit()
{
	submitbutton.click();
}





}