package eCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazone {
  @Test
  public void amazontest() throws InterruptedException {
	  WebDriver driver=  new ChromeDriver();
	  Reporter.log("opening amazhone", true);
	 // Thread.sleep(3000);
	  driver.get("https://www.amazon.in");
	  Thread.sleep(7000);
	  driver.close();
  }
}
