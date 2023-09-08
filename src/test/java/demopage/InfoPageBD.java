package demopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfoPageBD {
	WebDriver driver;
	By fname=By.id("first-name");
	By lname=By.id("last-name");
	By zip=By.id("postal-code");
	By next=By.id("continue");
	By cancel=By.id("cancel");
	By hbbtn=By.xpath("//*[@id=\"react-burger-menu-btn\"]");
	By logout=By.xpath("//*[@id=\"logout_sidebar_link\"]");

	public InfoPageBD(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name, String lastname, String zipcode)
	{
		driver.findElement(fname).sendKeys(name);
		driver.findElement(lname).sendKeys(lastname);
		driver.findElement(zip).sendKeys(zipcode);
	}
	
	public void continuebtn()
	{
		driver.findElement(next).click();
	}
	
	public void cancelpurchase()
	{
		driver.findElement(cancel).click();
	}
	
	public void hbbtn()
	{
		driver.findElement(hbbtn).click();
		driver.findElement(logout).click();
	}

}
