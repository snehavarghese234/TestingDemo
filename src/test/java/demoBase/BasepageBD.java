package demoBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BasepageBD {
	public WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	}
}
