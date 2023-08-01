package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ebay {
  @Test
  public void ebay() throws InterruptedException 
  {
	  WebDriver driver=  new ChromeDriver();
	  Reporter.log("opening ebay", false);
	 
	  driver.get("https://www.ebay.com/");
	  Thread.sleep(7000);
	  driver.quit(); 
	  
	  
	  
	  
  }
}
