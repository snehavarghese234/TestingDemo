package demopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageBD {
	WebDriver driver;
	By cartid=By.xpath("//*[contains(text(),'Add to cart')]");
	By view=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By check=By.id("checkout");
	
	public CartPageBD(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void addtocart()
	{
		driver.findElement(cartid).click();
	}
	
	public void viewcart()
	{
		driver.findElement(view).click();
	}
	public void purchase()
	{
		driver.findElement(check).click();
	}

}
