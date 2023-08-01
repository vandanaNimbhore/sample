package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipkarttest() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("Opening flipkart", true);
	  //Thread.sleep(3000);
	  driver.get("https://www.flipkart.com");
	  Thread.sleep(3000);
	  driver.quit();
	  
	  
  }
}
