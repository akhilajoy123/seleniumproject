package pagepackage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class Searchpage {
	WebDriver driver;
	
	By targetsearch=By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[1]/div[6]/form/input");
	
	public Searchpage(WebDriver driver)  //constructor
	{
		this.driver=driver;
	}
	public void searchclick(String search)
	{
		driver.findElement(targetsearch).sendKeys(search,Keys.ENTER);
	}

}
