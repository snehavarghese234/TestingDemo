package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By source=By.id("FromCity");
	By destination=By.id("ToCity");
	By date=By.id("txtFromDate");
	By searchbtn=By.xpath("//*[contains(text(), 'SEARCH')]");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String src, String dest, String depdate)
	{
		driver.findElement(source).sendKeys(src,Keys.ENTER);
		driver.findElement(destination).sendKeys(dest,Keys.ENTER);
		driver.findElement(date).sendKeys(depdate);
	}
	public void search()
	{
		driver.findElement(searchbtn).click();
	}
}
