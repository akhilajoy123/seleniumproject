package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Targetpage {
	WebDriver driver;
	
	By targetssign=By.xpath("//*[@id=\"headerPrimary\"]/a[4]/span");
	By targetsignin=By.xpath("/html/body/div[10]/div/div/div[2]/ul/div/button[1]");
	By targetemail=By.xpath("//*[@id=\"username\"]");
	By targetpswd=By.xpath("//*[@id=\"password\"]");
	By targetsigninwith=By.xpath("//*[@id=\"login\"]/span");
	
	
	public Targetpage(WebDriver driver)  //constructor
	{
		this.driver=driver;
	}
	
	public void signclick()            //action method
	{
		driver.findElement(targetssign).click();

	}
	public void signinclick1()           //action method
	{
		driver.findElement(targetsignin).click();
	}
	public void setValues(String email, String pswd)     //action method
	{
        driver.findElement(targetemail).sendKeys(email);
		driver.findElement(targetpswd).sendKeys(pswd);
	}
	public void signinwith()
	{
		driver.findElement(targetsigninwith).click();
	}

}
