package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homealert {
	//declaration
	@FindBy(xpath="//input[@name='cusid']")
	private WebElement customer;
	
	
	
	@FindBy(xpath="//input[@name='submit']")

	private WebElement button;

	






//initialisation of elements

public homealert(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//utilize



public void customerid()
{
	customer.sendKeys("12345");
}

public void buttonicon()
{
	button.click();
}








}


