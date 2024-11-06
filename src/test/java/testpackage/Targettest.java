package testpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackage.Addtocart;
import pagepackage.Checkout;
import pagepackage.Searchpage;
import pagepackage.Targetpage;


public class Targettest {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.target.com/");
	}
	@Test
	public void test1()
	{
		Targetpage ob=new Targetpage(driver);
		ob.signclick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ob.signinclick1();
		ob.setValues("akhilajoy450@gmail.com","target123*");
		ob.signinwith();
	}
	@Test
	public void test2()
	{
		 String actualtitle=driver.getTitle();
    	 String exptitle="Target";
    	 System.out.println("title="+actualtitle);
    	 if(actualtitle.equals(exptitle))
    	 {
    		 System.out.println("pass");
    	 }
    	 else
    	 {
    		 System.out.println("fail");
    	 }
	}
	@Test
	public void test3()
	{
		 String text=driver.getPageSource();
    	 if(text.contains("Target Circle"))
    	 {
    		 System.out.println("pass");
    	 }
    	 else
    	 {
    		 System.out.println("fail");
    	 }
    	 
    	
	}
	@Test
	public void test4()
	{
		Searchpage s1=new Searchpage(driver);
		s1.searchclick("halloweencandy");
		
	}
	@Test
	public void test5()
	{
		Addtocart a1=new Addtocart(driver);
		a1.sign();
		a1.wishlist();
		a1.addtocartclick();
		a1.viewcart();
		a1.checkout();
		
	}
	@Test
	public void test6()
	{
		Checkout c1=new Checkout(driver);
		c1.firstname("abc");
		c1.lastname("de");
		c1.addresstype("abcdefghi");
		c1.zipcode("sdf134");
		c1.citytype("mddbhhd");
		c1.dropdownbutton();
		c1.selectstate();
		c1.number("3456789087");
		driver.close();
		
		
	}

}
