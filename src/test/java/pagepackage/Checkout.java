package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
     WebDriver driver;
     
     By targetfirstname=By.xpath("//*[@id=\"first_name\"]");
     By targetlastname=By.xpath("//*[@id=\"last_name\"]");
     By targetaddress=By.xpath("//*[@id=\"address_line1\"]");
     By targetzipcode=By.xpath("//*[@id=\"zip_code\"]");
     By targetcity=By.xpath("//*[@id=\"city\"]");
     By targetdropdown=By.xpath("//*[@id=\"state\"]");
     By targetstate=By.xpath("//*[@id=\"state\"]");
     By targetphone=By.xpath("//*[@id=\"phone_number\"]");
     
     public Checkout(WebDriver driver)  //constructor
     {
    	 this.driver=driver;
     }
     public void firstname(String name)
     {
    	 driver.findElement(targetfirstname).sendKeys(name);
     }
     public void lastname(String last)
     {
    	 driver.findElement(targetlastname).sendKeys(last);
     }
     public void addresstype(String address)
     {
    	 driver.findElement(targetaddress).sendKeys(address);
     }
     public void zipcode(String zip)
     {
    	 driver.findElement(targetzipcode).sendKeys(zip);
     }
     public void citytype(String city)
     {
    	 driver.findElement(targetcity).sendKeys(city);
     }
     public void dropdownbutton()
     {
    	 driver.findElement(targetdropdown).click();
     }
     public void selectstate()
     {
    	 driver.findElement(targetstate).click();
     }
     public void number(String phnumber)
     {
    	 driver.findElement(targetphone).sendKeys(phnumber);
     }
}
