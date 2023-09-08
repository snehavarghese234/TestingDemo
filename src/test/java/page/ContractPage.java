package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ContractPage {
	WebDriver driver;
	By contractbtn=By.xpath("//*[contains(text(),'Buses on Contract')]");
	By cname=By.xpath("//*[@id=\"txtcontactPerson\"]");
	By mailid=By.id("txtEmail");
	By mob=By.id("txtMobileNo");
	
	public ContractPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void contractdet()
	{
		driver.findElement(contractbtn).click();
	}
	public void passvalues(String name,String mail, String num)
	{
		driver.findElement(cname).sendKeys(name,Keys.ENTER);
		driver.findElement(mailid).sendKeys(mail,Keys.ENTER);
		driver.findElement(mob).sendKeys(num,Keys.ENTER);
	}
	
}
