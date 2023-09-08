package demoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import demoBase.BasepageBD;
import demoUtilities.UtilityPageBD;
import demopage.CartPageBD;
import demopage.InfoPageBD;
import demopage.LoginPageBD;

public class TestPageBD extends BasepageBD{
	@Test
	public void verifyLoginWithValidCred() throws Exception
	{
	LoginPageBD lp=new LoginPageBD(driver);
	String xl="E:\\Pgms\\logindata.xlsx";
	String Sheet="Sheet2";
	int rowCount=UtilityPageBD.getRowCount(xl,Sheet);
	for(int i=1;i<=rowCount;i++)
	{
		String UserName=UtilityPageBD.getCellValue(xl,Sheet,i,0);
		System.out.println("username---"+UserName);
		String Pwd=UtilityPageBD.getCellValue(xl,Sheet,i,1);
		System.out.println("password---"+Pwd);
	
		//passing username and password as parameters
		lp.setvalues(UserName, Pwd);
		lp.login();
	}
	CartPageBD cp=new CartPageBD(driver);
	List<WebElement> li = driver.findElements(By.xpath("//*[contains(text(), 'Add to cart')]"));
	System.out.println("No of items:" +li.size());
	for(int i=1;i<=li.size();i++)
	{
	cp.addtocart();
	}
	cp.viewcart();
	cp.purchase();
	
	InfoPageBD ip=new InfoPageBD(driver);
	ip.setvalues("Anu", "Manu", "789456");
	ip.continuebtn();
	ip.cancelpurchase();
	ip.hbbtn();
	
	
	}
	}

