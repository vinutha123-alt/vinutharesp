package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
//declaration of elements
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement un;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement login;

	@FindBy(xpath="//a[@class='_21JmK0 _1__46T']")
	private WebElement forgot;

	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI jUwFiZ']")
	private WebElement request;



//initialisation of elements

public login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//utilisation of elements
public void Username()
{
	un.sendKeys("vinutha.naveen@gmail.com");
	
}
public void password()
{
	pwd.sendKeys("Bangalore169");

}


public void loginBu()
{
	login.click();

}


public void Forgotpwd()
{
	forgot.click();

}


public void requestotp()
{
	request.click();

}


}