package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.ContractPage;
import page.HomePage;

public class HomePageTest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://www.vrlbus.in/#/");
		driver.manage().window().maximize();
	}
	@Test
	public void hometest() throws Exception
	{
		HomePage hp= new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".btn-close")).click();
		hp.setvalues("Bengaluru", "Surat", "03-09-2023");
		hp.search();
		ContractPage cp=new ContractPage(driver);
		cp.contractdet();
		cp.passvalues("Ann", "ann@gmail.com", "7894561235");
	}
}
