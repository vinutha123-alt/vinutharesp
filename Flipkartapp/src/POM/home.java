package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home
{

	//declaration
	@FindBy(xpath="//input[@class='LM6RPg']")
	private WebElement search;
	
	
	
	@FindBy(xpath="//button[@class='vh79eN']")

	private WebElement sear;

	
	@FindBy(xpath="//div[text()='Realme 6i (Lunar White, 64 GB)']")

	private WebElement result;

	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")

	private WebElement cart;



//initialisation of elements

public home(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//utilize
public void search1(String value)
{
	search.sendKeys(value);
}

public void searchicon()
{
	sear.click();
}

public void resulticon()
{
	result.click();
}

public void carticon()
{
	cart.click();
}





}