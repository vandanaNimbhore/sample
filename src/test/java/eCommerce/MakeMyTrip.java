package eCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip {
	WebDriver driver;
  @Test
  public void makemytrip(int a) throws InterruptedException {
	  
	 driver= new ChromeDriver();
	driver.get("https://termlife.policybazaar.com/quotes/ex0Ck-hvYBU34gEz-kf9ow==?utm_campaign=PB_Misspell00Long_Term-bazar&utm_medium=ppc&utm_source=google_brand&utm_term=policebazar&isDefaultCity=false&isProgressiveJourney=true&custId=ssFiJs6cFzhYJ0Q6tUvYUQ==&payType=1&page=1");
	driver.manage().window().maximize();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//span[text()='Cover till age']")).click();
	Thread.sleep(3000);
	//WebElement txt=driver.findElement(By.xpath("//li[text()=' 62 yrs ']"));
   // txt.click();
      // System.out.println(txt.getText());
       MakeMyTrip ob=new MakeMyTrip();
       Thread.sleep(3000);
      // ob.selectElemnts(35);
       WebElement txt=driver.findElement(By.xpath("//li[text()=' "+a+" yrs ']"));
	    txt.click();
	       System.out.println(txt.getText());
	
	  
  }
  /*public   void selectElemnts(int a)
	{
	  WebElement txt=driver.findElement(By.xpath("//li[text()=' "+a+" yrs ']"));
	    txt.click();
	       System.out.println(txt.getText());
	}*/
	  
}
