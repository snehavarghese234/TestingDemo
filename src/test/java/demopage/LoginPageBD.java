package demopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageBD {
	WebDriver driver;
	By name=By.name("user-name");
	By pswrd=By.id("password");
	By loginbtn=By.id("login-button");
	
	public LoginPageBD(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String Username, String Password)
	{
		
		driver.findElement(name).clear();
		driver.findElement(name).sendKeys(Username);
		driver.findElement(pswrd).clear();
		driver.findElement(pswrd).sendKeys(Password);
	}
	
	public void login()
	{
		driver.findElement(loginbtn).click();
	}
	

}



