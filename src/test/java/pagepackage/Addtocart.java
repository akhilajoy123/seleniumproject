package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addtocart {
	WebDriver driver;
	
	By targetsign=By.xpath("//*[@id=\"headerPrimary\"]/a[4]");
	By targetwishlist=By.xpath("//*[@id=\"listaccountNav-targetCrushLink\"]/a/span/span");
	By targetaddtocart=By.xpath("//*[@id=\"addToCartButtonOrTextIdFor89604110\"]");
	By targetviewcart=By.xpath("/html/body/div[15]/div/div/div[2]/div[3]/a");
	By targetcheckout=By.xpath("//*[@id=\"orderSummaryWrapperDiv\"]/div/div[1]/div[3]/div/div/button");
	public Addtocart (WebDriver driver)  //constructor
	{
		this.driver=driver;
	}
	public void sign()
	{
		driver.findElement(targetsign).click();
	}
	public void wishlist()
	{
		driver.findElement(targetwishlist).click();
	}
	public void addtocartclick()
	{
	    driver.findElement(targetaddtocart).click();
	}
	public void viewcart()
	{
		driver.findElement(targetviewcart).click();
	}
	public void checkout()
	{
		driver.findElement(targetcheckout).click();
	}

}
